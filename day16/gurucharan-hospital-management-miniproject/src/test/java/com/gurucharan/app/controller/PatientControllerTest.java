packag com.gurucharan.app.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import repository.AppointmentRepository;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PatientTestController {

    @InjectMocks
    private PatientController patientController;

    @Mock
    private AppointmentRepository appointmentRepository;

    @Mock
    private Appointment appointment;

    @Mock
    private Prescription prescription;

    @Test
    public void saveAppointmentTest() {
        Prescription prescription = new Prescription();
        prescription.setPrescriptionId("prescript001");
        prescription.setAppointmentId("app001");
        prescription.setDescription("cold");
        prescription.setDoctorName("Guru");
        prescription.setPatientName("Prem");
        Appointment appointment=new Appointment();
        appointment.setAppointmentId("app001");
        appointment.setPatientName("Prem");
        appointment.setDoctorName("Guru");
        appointment.setDate("22/09/2023");
        appointment.setPrescription(prescription);
        when(appointmentRepository.save(appointment)).thenReturn(appointment);
        Appointment result = patientController.saveAppointment(appointment);
        assertEquals("app001",result.getAppointmentId());
        assertEquals("Prem",result.getPatientName());
        assertEquals("Guru",result.getDoctorName());
        assertEquals("22/09/2023",result.getDate());
        assertEquals(prescription,result.getPrescription());

    }

    @Test
    public void getAppointmentTest() {

        Prescription prescription = new Prescription("prescript001", "app001", "cold", "Guru", "Prem");
        Appointment appointment=new Appointment("app001","Prem","Guru","22/09/2023",prescription);
        when(appointmentRepository.findBypatientName(anyString())).thenReturn(appointment);
        Appointment result = patientController.getAppointments("Latha");
        assertEquals("app001",result.getAppointmentId());
        assertEquals("Guru",result.getPatientName());
        assertEquals("Prem",result.getDoctorName());
        assertEquals("22/09/2023",result.getDate());
        assertEquals(prescription,result.getPrescription());
    }

}