package service;

import entity.Doctor;
import repository.DoctorRepository;
import repository.DoctorRepositoryFile;
import utils.FileUtils;
import utils.InOutUtils;

import java.util.ArrayList;

public class ServiceDoctor {

    DoctorRepository doctorRepository = new DoctorRepositoryFile();


    public void createNewDoctor() throws Exception {
        System.out.println("Enter doctor details: ");
        Doctor newDoctor = new Doctor();
        newDoctor.setName(InOutUtils.getLine());
        newDoctor.setSecondName(InOutUtils.getLine());
        newDoctor.setThierdName(InOutUtils.getLine());
        newDoctor.setSpecialization(InOutUtils.getLine());


        doctorRepository.save(newDoctor);

        System.out.println(newDoctor);
    }

    public void showAllDoctors() {
        System.out.println("Список докторов");
        doctorRepository.readAllDoctors().forEach(doctor -> {
            System.out.println("Doctor " + doctor);
        });
    }

    public Doctor getDoctor(long id) {
        for (
                Doctor doctor : doctorRepository.readAllDoctors()) {
            if (doctor.getId() == id) {
                return doctor;
            }
        }
        return null;
    }
}