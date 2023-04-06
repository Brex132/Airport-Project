package com.example.testspring;


import com.example.testspring.user.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
    @GetMapping("/login")
    public String loginForm(){
        return "login";
    }
    @PostMapping("/login")
    public String FirstController(@RequestParam String username, @RequestParam String password){
        System.out.println(username);
        return "index";
    }

}
