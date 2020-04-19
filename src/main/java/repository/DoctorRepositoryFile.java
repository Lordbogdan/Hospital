package repository;

import entity.Doctor;
import utils.FileUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class DoctorRepositoryFile implements DoctorRepository {

    public DoctorRepositoryFile() {
        this.doctorArrayList = FileUtils.<Doctor>readFromFile("Doctors");
    }

    ArrayList<Doctor> doctorArrayList;

    @Override
    public ArrayList<Doctor> readAllDoctors() {
        return doctorArrayList;
    }

    @Override
    public void save(Doctor doctor) throws Exception {
        File file = new File("Doctors");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));

        doctor.setId(doctorArrayList.size() + 1);

        doctorArrayList.add(doctor);
        oos.writeObject(doctorArrayList);
        oos.close();


    }
}
