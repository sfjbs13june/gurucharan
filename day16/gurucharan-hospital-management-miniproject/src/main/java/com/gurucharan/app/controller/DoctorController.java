package com.gurucharan.app.controller;

import com.gurucharan.app.model.Appointment;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/doctors")
public class DoctorController {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @PostMapping(value ="/save")
    public Appointment saveAppointment(@RequestBody Appointment appointment){
        return appointmentRepository.save(appointment);
    }

    @GetMapping(value = "/doctorsAppointment")
    public Appointment getAppointment(@RequestParam String docterName){
        Appointment appointment=appointmentRepository.findBydoctorName(docterName);
        return appointment;
    }
}