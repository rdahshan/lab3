package com.example.demo2.Controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/signup")
    public String SignupForm(){
        return "signup.html";
    }
}
