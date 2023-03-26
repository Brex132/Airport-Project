package com.example.testspring;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @PostMapping("/airports")
    public String getAirPorts() {
        String[] arr = new String[2];
        arr[0] = "airport1";
        arr[1] = "airport2";

        return "aa";
    }

    @PostMapping("/login")
    public String redirect(@RequestBody Credentials c) {
        System.out.println(c.getFirstname());
        if(c.getFirstname().equals("ivan")) {
            return "Successfully";
        }
        return "Error";
    }
}
