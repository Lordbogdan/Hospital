package service;

import entity.Patient;
import entity.Recipe;
import utils.FileUtils;
import utils.InOutUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ServicePatient {
    ArrayList<Patient> patientArrayList;

    public ServicePatient() {
        this.patientArrayList = FileUtils.<Patient>readFromFile("Patient");
    }

    public void createNewPatient() throws Exception {
        System.out.println("Enter patient details and point out his injury priority: ");
        Patient newPatient = new Patient();
        File file = new File("Patient");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));

        newPatient.setId(patientArrayList.size() + 1);

        newPatient.setName(InOutUtils.getLine());
        newPatient.setSecondName(InOutUtils.getLine());
        newPatient.setThierdName(InOutUtils.getLine());
        newPatient.setPhone(InOutUtils.getInt());


        patientArrayList.add(newPatient);

        oos.writeObject(patientArrayList);
        oos.close();

        System.out.println(newPatient);

    }

    public void showAllPatient() {
        System.out.println("Список пациентов");
        patientArrayList.forEach(patient -> {
            System.out.println("Patient " + patient);
        });
    }

    public Patient getPatient(long id) {
        for (Patient patient : patientArrayList) {
            if (patient.getId() == id) {  //
                return patient;
            }
        }
        return null;
    }
}
