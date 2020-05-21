package repository;

import entity.Doctor;


import java.util.ArrayList;

public interface DoctorRepository {
    ArrayList<Doctor> readAllDoctors();


    void save(Doctor doctor) throws Exception;
}
