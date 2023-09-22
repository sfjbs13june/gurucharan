package com.gurucharan.app.repository;

@Repository
public interface AppointmentRepository extends MongoRepository<Appointment,String> {

    public Appointment findBydoctorName(String doctorName);

    public Appointment findBypatientName(String patientName);

    public Appointment save(Appointment appointment);
}