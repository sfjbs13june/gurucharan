package com.eureka.app.patient.controller;

import com.eureka.app.patient.dto.Patient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PatientServiceController {
 
    private static Map<String, List<Patient>> hospitalDB = new HashMap<String, List<Patient>>();
 
    static {
        hospitalDB = new HashMap<String, List<Patient>>();
 
        List<Patient> lst = new ArrayList<Patient>();
        Patient ptn = new Patient("Patient1", "ward1");
        lst.add(ptn);
        ptn = new Patient("Patient2", "ward2");
        lst.add(ptn);
 
        hospitalDB.put("hospital1", lst);
 
        lst = new ArrayList<Patient>();
        ptn = new Patient("Patient3", "ward3");
        lst.add(ptn);
        ptn = new Patient("Patient4", "ward4");
        lst.add(ptn);
 
        hospitalDB.put("hospital2", lst);
 
    }
 
    @RequestMapping(value = "/getPatientsDetailsForHospital/{hospitalname}", method = RequestMethod.GET)
    public List<Patient> getPatients(@PathVariable String hospitalname) {
        System.out.println("Getting Patient details for " + hospitalname);
 
        List<Patient> patientList = hospitalDB.get(hospitalname);
        if (patientList == null) {
            patientList = new ArrayList<Patient>();
            Patient ptn = new Patient("Not Found", "N/A");
            patientList.add(ptn);
        }
        return patientList;
    }
}