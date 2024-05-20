package com.example.demo.contellers;

import com.example.demo.services.MailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Controller
@RequestMapping("/techGadget")
public class MainController {
    @PreAuthorize("isAuthenticated()")
    @GetMapping("/laptops")
    public String getLaptops(){
        return "laptops";
    }
    @PreAuthorize("isAuthenticated()")
    @GetMapping("/phones")
    public String getPhones(){
        return "phones";
    }
    @PreAuthorize("isAuthenticated()")
    @GetMapping("/phones/{id}")
    public String getPhones(@PathVariable("id")Long id, Model model){
        model.addAttribute("id",id);
        return "phone";
    }
    @GetMapping("/sign-in")
    public String login(){
        return "authorize/signIn";
    }
    @GetMapping("/sign-up")
    public String signUp(){
        return "authorize/signUp";
    }
    @GetMapping("/user/forgot")
    public String forgot(){
        return "authorize/forgot";
    }

}
