import Doctor.Doctor;
import Patient.Patient;
import Recipe.Recipe;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Doctor> doctorArrayList = new Main().readDoctorsFromFile();
        System.out.println("Registration");
        System.out.println("To register a doctor, enter 1");
        System.out.println("To register a patient, enter 2");
        System.out.println("Показать списки докторов, введите 3");


        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.nextLine();


        if (x == 1) {
            System.out.println("Enter doctor details: ");
            Doctor newDoctor = new Doctor();
            File file = new File("Doctors");
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));

            newDoctor.setName(scanner.nextLine());
            newDoctor.setSecondName(scanner.nextLine());
            newDoctor.setThierdName(scanner.nextLine());
            newDoctor.setSpecialization(scanner.nextLine());
            doctorArrayList.add(newDoctor);
            oos.writeObject(doctorArrayList);
            oos.close();
            System.out.println(newDoctor);

        } else if (x == 2) {
            System.out.println("Enter patient details and point out his injury priority: ");
            Patient newPatient = new Patient();
            Recipe newRecipe = new Recipe();

            File file = new File("Doctors");
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(newPatient);
            oos.writeObject(newRecipe);
            oos.close();

            newPatient.setName(scanner.nextLine());
            newPatient.setSecondName(scanner.nextLine());
            newPatient.setThierdName(scanner.nextLine());
            newPatient.setPhone(scanner.nextInt());
            scanner.nextLine();
            newRecipe.setPriority(scanner.nextLine());
            newRecipe.setPatient(newPatient);//у нашего рецепта есть свой пациент

            System.out.println(newPatient);
            System.out.println(newRecipe);


        } else if (x == 3) {
            System.out.println("Список докторов");
            doctorArrayList.forEach(doctor -> {
                System.out.println("Doctor " + doctor);
            });
        } else {
            System.out.println("Выйти");

        }
    }

    public ArrayList<Doctor> readDoctorsFromFile() {
        ArrayList<Doctor> doctors;
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("Doctors")));
            doctors = (ArrayList<Doctor>) ois.readObject();
            return doctors;
        } catch (Exception e) {
            System.out.println("File is empty");
            e.printStackTrace();
        }
        return new ArrayList<Doctor>();
    }

}
