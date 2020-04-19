package service;

import entity.Doctor;
import repository.DoctorRepository;
import repository.DoctorRepositoryFile;
import utils.FileUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiceDoctor {
    DoctorRepository doctorRepository = new DoctorRepositoryFile();

    public ServiceDoctor() {

    }

    public void createNewDoctor(Scanner scanner) throws Exception {
        System.out.println("Enter doctor details: ");
        Doctor newDoctor = new Doctor();
        newDoctor.setName(scanner.nextLine());
        newDoctor.setSecondName(scanner.nextLine());
        newDoctor.setThierdName(scanner.nextLine());
        newDoctor.setSpecialization(scanner.nextLine());

        doctorRepository.save(newDoctor);

        System.out.println(newDoctor);
    }

    public void showAllDoctors() {
        System.out.println("Список докторов");
        doctorRepository.readAllDoctors().forEach(doctor -> {
            System.out.println("Doctor " + doctor);
        });
    }
}
