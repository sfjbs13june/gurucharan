package com.gurucharan.app;

import org.springframework.web.bind.annotation.*;

@RestController
public class ApplicationController {


    @GetMapping("/get")
    public String getData(){
        return "get Gurucharan";
    }

    @PostMapping("/post")
    public String postData(){
        return "post Gurucharan";
    }

    @PutMapping("/put")
    public String putData(){
        return "put Gurucharan";
    }

    @DeleteMapping("/delete")
    public String deleteData(){
        return "delete Gurucharan";
    }
}
