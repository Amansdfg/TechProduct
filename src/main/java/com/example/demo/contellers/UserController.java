package com.example.demo.contellers;

import com.example.demo.entities.PhoneDTO;
import com.example.demo.entities.User;
import com.example.demo.exceptions.ErrorDetails;
import com.example.demo.exceptions.NotFoundException;
import com.example.demo.services.MailSenderService;
import com.example.demo.services.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService service;
    @Autowired
    private MailSenderService mailSenderService;

    private  Random random=new Random();
    private int code;
    @GetMapping
    public List<User> getAllUsers(){
        return service.getAllUsers();
    }
    @GetMapping("{id}")
    public ResponseEntity<?> getUserById(@PathVariable("id")Long id){
        try {
            User user = service.getUserById(id);
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(user);
        }catch (NotFoundException e){
            ErrorDetails errorDetails=new ErrorDetails("User not found");
            return ResponseEntity.badRequest().body(errorDetails);
        }
    }
    @PostMapping
    public String addUser(@RequestBody User user,@RequestParam("retypePassword")String word){
        try {
            mailSenderService.send(user.getEmail(), "Authorization", "Successfully signed up to techGadget");
            return service.signUp(user, word);
        }catch (Exception e){
            return "Email doest exits";
        }
    }
    @DeleteMapping("{id}")
    public void deleteUserById(@PathVariable("id")Long id) {
        service.deleteUserById(id);
    }
    @GetMapping(value = "/forgot/{email}")
    public ResponseEntity<?> forgot(@PathVariable("email")String email){
        try {
            User user = service.getUserByEmail(email);
            code = 1000 + random.nextInt(8999);
            System.out.println("Code send to mail code is: " + code);
            mailSenderService.send(email, "Confirmation code", code + "");
            return ResponseEntity.status(HttpStatus.OK).body(user);
        }catch (NotFoundException e){
            ErrorDetails errorDetails=new ErrorDetails("Could found an email");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorDetails);
        }
    }
    @GetMapping("/send/{code}")
    public String send(@PathVariable("code")int c){
        System.out.println("Aman  c = " +c +", code = "+code);
        return (code==c)?"successfully":"unsuccessfully";
    }
    @PatchMapping("/{id}")
    public ResponseEntity<?> updateUser(@PathVariable Long id, @RequestBody User updatedUser) {
        try {
            User existingUser = service.getUserById(id);
            BeanUtils.copyProperties(updatedUser, existingUser, "id");
            String response = service.updateUser(existingUser);
            if (response.equals("Successfully updated")) {
                return ResponseEntity.status(HttpStatus.OK).body(existingUser);
            }else{
                throw new NotFoundException();
            }
        }catch (NotFoundException e) {
            ErrorDetails errorDetails=new ErrorDetails("Something went wrong");
            return ResponseEntity.badRequest().header("response","Something went wrong").body(errorDetails);
        }
    }
    @PostMapping("/change")
    public String change(@RequestParam("id")Long id,@RequestParam("password")String password,@RequestParam("retypePassword")String retypePassword){
        return service.changePassword(id,password,retypePassword);
    }
    @GetMapping("/bag")
    public List<PhoneDTO> getPhones(@AuthenticationPrincipal User user){
        return service.getPhones(user.getId());
    }
}
