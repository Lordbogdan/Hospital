package repository;

import entity.Patient;

import java.util.ArrayList;

public interface PatientRepository {
    ArrayList<Patient> readAllPatient();

    void save(Patient patient) throws Exception;
}

