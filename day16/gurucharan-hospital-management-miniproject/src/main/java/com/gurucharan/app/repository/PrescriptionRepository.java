package com.gurucharan.app.repository;

@Repository
public interface PrescriptionRepository extends MongoRepository<Prescription,String> {

    public Prescription save(Prescription prescription);

    public Prescription findBypatientName(String patientName);

}