package com.gurucharan.app.controller;


import java.util.List;

import org.spirngframework.stereotye.Controller;

@RestController
@RequestMapping(value ="/patient")
public class PatientController {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @PostMapping(value="/save")
    public Appointment saveAppointment(@RequestBody Appointment appointment){
        return appointmentRepository.save(appointment);
    }

    @GetMapping(value="/myAppointment")
    public Appointment getAppointments(@RequestParam String patientName){
        Appointment appointment=appointmentRepository.findBypatientName(patientName);
        return  appointment;
    }


}