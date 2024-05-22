package com.example.demo.contellers;



import com.example.demo.entities.Phone;
import com.example.demo.entities.PhoneDTO;
import com.example.demo.entities.User;
import com.example.demo.mapper.MapperPhones;
import com.example.demo.services.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/phones")
public class PhoneController {
    @Autowired
    private PhoneService phoneService;
    @Autowired
    private MapperPhones mapper;
    @GetMapping
    public List<PhoneDTO> phones(){
        return phoneService.getAllPhones();
    }
    @GetMapping("/name")
    public List<PhoneDTO> findByName(@RequestParam("name")String name){
        return phoneService.searchByName(name);
    }
    @GetMapping("{phoneId}")
    public PhoneDTO getPhoneById(@PathVariable("phoneId")Long id){
        return phoneService.getPhoneById(id);
    }
    @PostMapping
    public PhoneDTO addPhone(Phone phone){
        return phoneService.addPhone(phone);
    }
    @PutMapping
    public PhoneDTO updatePhone(Phone phone){
        return phoneService.updatePhones(phone);
    }
    @DeleteMapping(value = "{id}")
    public void deletePhone(@PathVariable("id") Long id){
        phoneService.removePhone(id);
    }
    @PostMapping("/addToBag/{id}")
    public String addToBag(@PathVariable("id")Long id, @AuthenticationPrincipal User user){
        return phoneService.addToBag(user,id);

    }
}
