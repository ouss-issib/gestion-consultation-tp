package ma.enset.gestionconsultationbdcc.services;

import ma.enset.gestionconsultationbdcc.entities.Patient;

import java.util.List;

public interface IPatientService {
    void addPatient(Patient patient);
    void updatePatient(Patient patient);
    void deletePatient(Patient patient);
    List<Patient> getPatients();
    Patient getPatient(Long id);
}
