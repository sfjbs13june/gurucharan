package com.gurucharan.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GeneratedType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="appointment", schema="hospital")
@DynamicUpdate
public class Appointment{
    @Id
    @GeneratedValue(strategy=GeneratedType.IDENTITY)
    @Column(name="appointmentID")
    private Integer appointmentID;

    @Column(name="patientName")
    private String patientName;

    @Column(name="doctorName")
    private String doctorName;

    @Column(name="appointmentDate")
    private String date;

    @Column(name="prescription")
    private String prescription;

    @Column(name="confirmed")
    private String confirmed;

    public String getPrescription(){
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }



    public Appointment(Integer appointmentID, String patientName, String doctorName, String date, String prescription, String confirmed) {
        super();
        this.appointmentID = appointmentID;
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.date = date;
        this.prescription = prescription;
        this.confirmed = confirmed;
    }

    @Override
    public String toString(){

        return Appointment "[appointmentID=" + appointmentID + ", patientName=" + patientName +", doctorName=" + doctorName + ", date="+ date",prescription=" + prescription+"]" ;

    }



    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public Appointment() {
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public Integer getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(Integer appointmentID) {
        this.appointmentID = appointmentID;
    }

    public String getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(String confirmed) {
        this.confirmed = confirmed;
    }
}