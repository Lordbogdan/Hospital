import Doctor.Doctor;
import Patient.Patient;
import Recipe.Recipe;

import java.sql.SQLOutput;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
//        Patient v1 = new Patient("Vlad", "Egorenko", "Alekseevich", 838383);
//        Patient v2 = new Patient("Kolya", "Ivanov", "Andreevich", 676767);
//        Patient v3 = new Patient("Nikita", "Ivanenko", "Afonasievich", 676767);
//        Doctor a1 = new Doctor("Andrey", "Matveev", "Borisovich", "Surgeon");
//        Doctor a2 = new Doctor("Masha", "Markova", "Bogdanovna", "Surgeon");
//        Doctor a3 = new Doctor("Dasha", "Marikova", "Vasina", "Surgeon");
//        Recipe r1 = new Recipe("recipe", "fracture", 21, 22, "Normal");
//        Recipe r2 = new Recipe("recipe", "fracture", 21, 22, "Normal");
//        Recipe r3 = new Recipe("recipe", "fracture", 21, 22, "Normal");
        System.out.println("Registration");
        System.out.println("To register a doctor, enter 1");
        System.out.println("To register a patient, enter 2");


        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        String z = scanner.nextLine();

        if (x == 1) {
            System.out.println("Enter doctor details: ");
            Doctor newDoctor = new Doctor();
            newDoctor.setName(scanner.nextLine());
            newDoctor.setSecondName(scanner.nextLine());
            newDoctor.setThierdName(scanner.nextLine());
            newDoctor.setSpecialization(scanner.nextLine());
            System.out.println(newDoctor);
            System.out.println("Details doctor: " + newDoctor.getName() + newDoctor.getSecondName() + newDoctor.getThierdName() + newDoctor.getSpecialization());

        }
        else if (x == 2) {
            System.out.println("Enter patient details: ");
            Patient newPatient = new Patient();
            newPatient.setName(scanner.nextLine());
            newPatient.setSecondName(scanner.nextLine());
            newPatient.setThierdName(scanner.nextLine());
            newPatient.setPhone(scanner.nextInt());
            System.out.println(newPatient);
            System.out.println("Details patient: " + newPatient.getName() + newPatient.getSecondName() + newPatient.getThierdName() + newPatient.getPhone());
        }
        else {
            System.out.println("Выйти");

        }
    }
}