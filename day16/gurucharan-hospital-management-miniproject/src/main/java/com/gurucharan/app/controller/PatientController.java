package com.gurucharan.app.controller;


import java.util.List;

import org.spirngframework.stereotye.Controller;

@Controller
@RequestMapping("/patients")
public class PatientController{

    @Autowired
    private appointmentService service;

   // @GetMapping("/myAppointments")

}