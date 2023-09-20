package com.gurucharan.app.model;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class Hospital {

    String hospitalName;
    String hospitalId;
    String address;

    public Hospital(){}

    public Hospital(String hospitalName, String hospitalId, String address) {
        this.hospitalName = hospitalName;
        this.hospitalId = hospitalId;
        this.address = address;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
