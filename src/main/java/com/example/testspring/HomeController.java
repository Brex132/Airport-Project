package com.example.testspring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class HomeController {
    @GetMapping("/")
    public String FirstController(){
        return "index";

    }

    //    @PostMapping("/login")
    //    public String redirect(@RequestBody String firstname) {
    //        System.out.println(firstname);
    //        if(firstname.equals("ivan")) {
    //            return "index";
    //        }
    //        return "";
    //    }
}
