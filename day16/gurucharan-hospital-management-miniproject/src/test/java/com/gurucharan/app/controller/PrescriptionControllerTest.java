package com.gurucharan.app.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import repository.PrescriptionRepository;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class PrescriptionTestController {

    @InjectMocks
    private PrescriptionController prescriptionController;

    @Mock
    private PrescriptionRepository prescriptionRepository;

    @Mock
    private Prescription prescription;


    @Test
    public void saveprescription() {
        Prescription prescription = new Prescription();
        prescription.setPrescriptionId("prescript001");
        prescription.setAppointmentId("app001");
        prescription.setDescription("cold");
        prescription.setDoctorName("Guru");
        prescription.setPatientName("Prem");
        when(prescriptionRepository.save(prescription)).thenReturn(prescription);
        Prescription result =prescriptionController.saveprescription(prescription);
        assertEquals("prescript001", result.getPrescriptionId());
        assertEquals("app001", result.getAppointmentId());
        assertEquals("cold", result.getDescription());
        assertEquals("Prem", result.getPatientName());
        assertEquals("Guru", result.getDoctorName());
    }
    @Test
    public void getPrescriptionTest() {
        Prescription prescription = new Prescription("prescript001", "app001", "cold", "Prem", "Guru");
        when(prescriptionRepository.findBypatientName(anyString())).thenReturn(prescription);
        Prescription result = prescriptionController.getprescription("Prem");
        assertEquals("prescript001", result.getPrescriptionId());
        assertEquals("app001", result.getAppointmentId());
        assertEquals("cold", result.getDescription());
        assertEquals("Prem", result.getPatientName());
        assertEquals("Guru", result.getDoctorName());
    }



}