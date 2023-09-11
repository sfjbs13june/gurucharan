package com.gurucharan.app.controller;

import com.gurucharan.app.model.Hospital;
import com.gurucharan.app.model.Patient;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HospitalController {

    Map<String, Hospital> hospitalMap= new HashMap<String,Hospital>();

    @PostMapping("/savehospital")
    public Hospital AddHospital(@RequestBody Hospital hospital){
        hospitalMap.put(hospital.getHospitalName(),hospital);
        return hospital;
    }

    @GetMapping("/get/hospital")
    public Hospital getHospital(@RequestParam("hospitalname") String hospitalname){
        return hospitalMap.get(hospitalname);
    }

    @PutMapping("/update/hospital")
    public Hospital updateHospital(@RequestParam("hospitalname") String hospitalname, @RequestParam("address") String address){
        Hospital hospital=hospitalMap.get(hospitalname);
        hospital.setHospitalName(hospitalname);
        hospitalMap.put(hospitalname,hospital);
        return hospital;

    }


    @DeleteMapping("/remove/hospital")
    public void deleteHospital(@RequestParam("hospitalname") String hospitalname){
        hospitalMap.remove(hospitalname);
    }
}
