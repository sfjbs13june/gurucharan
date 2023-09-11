package com.gurucharan.app.unittests;

import com.gurucharan.app.controller.HospitalController;
import com.gurucharan.app.model.Hospital;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@RunWith(MockitoJUnitRunner.class)
public class HospitalTestController {

    @InjectMocks
    HospitalController hospitalController = new HospitalController();

    @Test
    public void test_addHospital() {
        Hospital hospital = new Hospital("Aishwarya", "98760", "Bangalore");
        Hospital result = hospitalController.AddHospital(hospital);
        assertEquals("Aishwarya", result.getHospitalName());
        assertEquals("98760", result.getHospitalName());
        assertEquals("Bangalore", result.getAddress());

    }

    @Test
    public void test_getHospital() {
        Hospital hospital = new Hospital("Aishwarya", "98760", "Bangalore");
        hospitalController.AddHospital(hospital);
        Hospital result = hospitalController.getHospital("Aishwarya");
        assertEquals("Aishwarya", result.getHospitalName());
        assertEquals("98760", result.getHospitalId());
        assertEquals("Bangalore", result.getAddress());

    }

    @Test
    public void test_updateHospital() {
        Hospital hospital = new Hospital("Aishwarya", "98760", "Bangalore");
        hospitalController.AddHospital(hospital);
        Hospital result = hospitalController.updateHospital("Aishwarya", "Mysore");
        assertEquals("Aishwarya", result.getHospitalName());
        assertEquals("98760", result.getHospitalId());
        assertEquals("Mysore", result.getAddress());

    }

    @Test
    public void test_deleteHospital() {
        Hospital hospital = new Hospital();
        hospital.setHospitalName("Aishwarya");
        hospital.setHospitalId("98760");
        hospital.setAddress("Bangalore");
        hospitalController.deleteHospital("Aishwarya");
        Hospital result = hospitalController.getHospital("Aishwarya");
        assertNull(result);


    }

}