package repository;

import entity.Doctor;
import entity.Patient;
import utils.FileUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class PatientRepositoryFile implements PatientRepository {

    ArrayList<Patient> patientArrayList;

    public PatientRepositoryFile() {
        this.patientArrayList = FileUtils.<Patient>readFromFile("Patient");
    }

    @Override
    public ArrayList<Patient> readAllPatient() {
        return patientArrayList;
    }

    @Override
    public void save(Patient patient) throws Exception {
        File file = new File("Patient");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));


    }

}
