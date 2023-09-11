package com.gurucharan.app.unittests;

import com.gurucharan.app.controller.PatientController;
import com.gurucharan.app.model.Patient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@RunWith(MockitoJUnitRunner.class)
public class PatientTestController {

    @InjectMocks
    PatientController patientController =new PatientController();

    @Test
    public void test_SavePatient() {
        Patient patient = new Patient("Guru", 123, "Appolo", "cold");
        Patient result = patientController.AddPatient(patient);
        assertEquals("Guru", result.getPatientName());
        assertEquals(123, result.getPatientId());
        assertEquals("Appolo", result.getHospitalName());
        assertEquals("cold", result.getDisease());
    }

    @Test
    public void test_getPatient(){
            Patient patient=new Patient("Guru",123,"Appolo","cold");
            patientController.AddPatient(patient);
            Patient result=patientController.getPatient("Guru");
            assertEquals("Guru",result.getPatientName());
            assertEquals(123,result.getPatientId());
            assertEquals("Appolo",result.getHospitalName());
            assertEquals("cold",result.getDisease());

    }

    @Test
    public void test_updatePatient() {
        Patient patient = new Patient("Guru", 123, "Appolo", "cold");
        patientController.AddPatient(patient);
        Patient result = patientController.updatePatient("Guru", "Manipal");
        assertEquals("Guru", result.getPatientName());
        assertEquals(123, result.getPatientId());
        assertEquals("Manipal", result.getHospitalName());
        assertEquals("cold", result.getDisease());
    }

    @Test
    public void test_deletePatient() {
        Patient patient = new Patient();
        patient.setPatientName("Guru");
        patient.setPatientId(123);
        patient.setPatientName("Appolo");
        patient.setDisease("cold");
        patientController.AddPatient(patient);
        patientController.deletePatient("Guru");
        Patient result=patientController.getPatient("Guru");
        assertNull(result);
    }

}
