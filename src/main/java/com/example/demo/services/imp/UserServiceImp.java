package com.example.demo.services.imp;

import com.example.demo.entities.Approval;
import com.example.demo.entities.User;
import com.example.demo.exceptions.NotFoundException;
import com.example.demo.repositories.RepositoryApproval;
import com.example.demo.repositories.RepositoryUser;
import com.example.demo.services.MailSenderService;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImp implements UserDetailsService , UserService {
    @Autowired
    private RepositoryUser users;
    @Autowired
    private RepositoryApproval approvals;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user=users.findAllByEmail(username);
        if(user==null){
            throw new UsernameNotFoundException("User is not found");
        }
        return user;
    }
    public String signUp(User user,String retypePassword){
        User currentUser=users.findAllByEmail(user.getEmail());
        if(currentUser==null){
            if(user.getPassword().equals(retypePassword)) {
                currentUser = user;
                currentUser.setPassword(passwordEncoder.encode(user.getPassword()));
                Approval approval = approvals.findAllByStatus("user");
                List<Approval> approvals1 = new ArrayList<>();
                approvals1.add(approval);
                currentUser.setApprovals(approvals1);
                users.save(currentUser);
                return "success";
            }else{
                return "passwordMissMatch";
            }
        }else {
            return "exits";
        }
    }
    @Override
    public List<User> getAllUsers() {
        return users.findAll();
    }
    @Override
    public User getUserById(Long id) {
        return users.findById(id).orElseThrow(() -> new NotFoundException());
    }
    @Override
    public String updateUser(User user) {
        if(users.existsById(user.getId())) {
            users.save(user);
            return "Successfully updated";
        }
        return "User with current id doesnt exists in our database";
    }
    @Override
    public void deleteUserById(Long id) {
        users.deleteById(id);
    }

    @Override
    public User getUserByEmail(String email) throws NotFoundException {
        User user=users.findAllByEmail(email);
        if(user==null){
            throw  new NotFoundException();
        }
        return user;
    }

    @Override
    public String changePassword(Long id, String password, String retypePassword) {
        if(!password.equals(retypePassword)){
            return "missMatchException";
        }
        User user=users.findById(id).orElseThrow();
        user.setPassword(passwordEncoder.encode(password));
        users.save(user);
        return "success";
    }
}
