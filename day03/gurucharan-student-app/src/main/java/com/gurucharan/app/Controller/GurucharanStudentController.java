package com.gurucharan.app.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GurucharanStudentController {
    @GetMapping("/getstudent")
    public String getStudentDetail(){
        return "Gurucharan";
    }

    @PutMapping("/updatestudent")
    public String updateStudent(){
        return "Updated Gurucharan";
    }
    @DeleteMapping("/deletestudent")
    public String deleteStudent(){
        return "Delete Gurucharan";
    }
}
