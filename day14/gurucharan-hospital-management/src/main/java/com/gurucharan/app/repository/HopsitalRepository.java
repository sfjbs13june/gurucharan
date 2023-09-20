package com.gurucharan.app.repository;

import com.gurucharan.app.model.Hospital;
import org.springframework.data.repository.CrudRepository;


public interface HopsitalRepository extends CrudRepository<Hospital, Integer> {

}