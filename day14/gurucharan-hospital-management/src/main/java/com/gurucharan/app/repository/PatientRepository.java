package com.gurucharan.app.repository;

import com.gurucharan.app.model.Patient;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<Patient,Integer> {
}