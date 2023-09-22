package com.gurucharan.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@RestController
public class PrescriptionController {

    @Autowired
    private PrescriptionRepository prescriptionRepository;

    @PostMapping("/savePrescription")
    public Prescription saveprescription(@RequestBody Prescription prescription)
    {
        Prescription pres=prescriptionRepository.save(prescription);
        return pres;
    }

    @GetMapping("/viewPrescription")
    public Prescription getprescription(@RequestParam String patientName){
        Prescription prescription=prescriptionRepository.findBypatientName(patientName);
        return prescription;
    }

    @GetMapping(value ="/get")
    public  String getData()
    {
        return "String displayed";
    }
}