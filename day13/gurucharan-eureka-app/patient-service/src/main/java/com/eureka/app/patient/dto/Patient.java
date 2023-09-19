package com.eureka.app.patient.dto;

public class Patient
{
    private String name;
    private String wardName;

    public Patient(String name, String wardName) {
        super();
        this.name = name;
        this.wardName = wardName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWardName() {
        return wardName;
    }

    public void setWardName(String wardName) {
        this.wardName = wardName;
    }
}

