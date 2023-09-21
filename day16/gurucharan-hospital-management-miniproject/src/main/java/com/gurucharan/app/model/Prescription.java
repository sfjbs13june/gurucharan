package com.gurucharan.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GeneratedType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="prescription", schema="hospital")
@DynamicUpdate
public class Prescription {

    @Id
    @GeneratedValue(strategy=GeneratedType.IDENTITY)
    @Column(name="prescriptionID")
    private Integer prescriptionID;

    public Integer getPrescriptionID() {
        return prescriptionID;
    }

    public void setPrescriptionID(Integer prescriptionID) {
        this.prescriptionID = prescriptionID;
    }

    @Column
    private String patientName;

    @Column
    private Integer appointmentID;

    @Column
    private  Sting description;

    @Column
    private String doctorName;

    public Prescription(String patientName, Integer appointmentID, Sting description, String doctorName) {
        super();
        this.patientName = patientName;
        this.appointmentID = appointmentID;
        this.description = description;
        this.doctorName = doctorName;
    }

    public Prescription() {
    }

    public String getPatientName() {
        return patientName;
    }

    public Integer getAppointmentID() {
        return appointmentID;
    }

    public Sting getDescription() {
        return description;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setAppointmentID(Integer appointmentID) {
        this.appointmentID = appointmentID;
    }

    public void setDescription(Sting description) {
        this.description = description;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
}