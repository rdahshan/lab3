package com.example.demo2.Controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @GetMapping("/signup")
    public String SignupForm(){
        return "signup.html";
    }
    /*
    @PostMapping("/user")
    Public String homePage(@ModelAttribute User user){
        return "redirect:/home.html";
    }*/
}
