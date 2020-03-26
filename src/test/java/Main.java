import Doctor.Doctor;
import Patient.Patient;
import Recipe.Recipe;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
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
            System.out.println("Enter patient details and point out his injury priority: ");
            Patient newPatient = new Patient();
            Recipe newRecipe = new Recipe();

            newPatient.setName(scanner.nextLine());
            newPatient.setSecondName(scanner.nextLine());
            newPatient.setThierdName(scanner.nextLine());
            newPatient.setPhone(scanner.nextInt());
            newRecipe.setPriority(scanner.nextLine());
            System.out.println(newPatient);
            System.out.println("Details patient: " + newPatient.getName() + newPatient.getSecondName() + newPatient.getThierdName() + newRecipe.getPriority() + newPatient.getPhone());
        }
        else {
            System.out.println("Выйти");

        }

    }

}

