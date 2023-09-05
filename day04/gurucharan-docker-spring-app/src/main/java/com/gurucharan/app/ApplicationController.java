package com.gurucharan.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    @GetMapping("/name")
    public String name(){
        return "Gurucharan";
    }

    @GetMapping("/age")
    public int age(){
        return 25;
    }

    @GetMapping("/address")
    public String address(){
        return "Bangalore";
    }

}
