package com.gurucharan.app.controller;

import com.gurucharan.app.model.Appointment;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
    @GetMapping("/doctorAppointment")
    public List<Appointment> getAppointments(@RequestParam String doctorName){

        return null;
    }
    @PostMapping("/save")
    public Appointment saveAppointment(@RequestBody Appointment appointment){

        return appointment;
    }

}