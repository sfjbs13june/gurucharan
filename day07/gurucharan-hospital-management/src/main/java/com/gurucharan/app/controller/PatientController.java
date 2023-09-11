package com.gurucharan.app.controller;

import com.gurucharan.app.model.Patient;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class PatientController {

    Map<String, Patient> patientMap= new HashMap<String,Patient>();

    @PostMapping("/savePatient")
    public Patient AddPatient(@RequestBody Patient patient){
        patientMap.put(patient.getPatientName(),patient);
        return patient;
    }

    @GetMapping("/get/patient")
    public Patient getPatient(@RequestParam("patientname") String patientname){
        return patientMap.get(patientname);
    }

    @PutMapping("/update/patient")
    public Patient updatePatient(@RequestParam("patientname") String patientname, @RequestParam("hospitalname") String hospitalname){
        Patient patient=patientMap.get(patientname);
        patient.setHospitalName(hospitalname);
        patientMap.put(patientname,patient);
        return patient;

    }


    @DeleteMapping("/remove/patient")
    public void deletePatient(@RequestParam("Patientname") String patientname){
        patientMap.remove(patientname);
    }

}
