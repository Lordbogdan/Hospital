import Doctor.Doctor;
import Patient.Patient;
import Recipe.Recipe;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Registration");
        System.out.println("To register a doctor, enter 1");
        System.out.println("To register a patient, enter 2");

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.nextLine();

        if (x == 1) {
            System.out.println("Enter doctor details: ");
            Doctor newDoctor = new Doctor();
            File file = new File("testFile");
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(newDoctor);
            oos.close();

            newDoctor.setName(scanner.nextLine());
            newDoctor.setSecondName(scanner.nextLine());
            newDoctor.setThierdName(scanner.nextLine());
            newDoctor.setSpecialization(scanner.nextLine());

            System.out.println(newDoctor);

        }
        else if (x == 2) {
            System.out.println("Enter patient details and point out his injury priority: ");
            Patient newPatient = new Patient();
            Recipe newRecipe = new Recipe();

            File file = new File("testFile");
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
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("testFile")));
            System.out.println(ois.readObject());
            ois.close();
        } else {
            System.out.println("Выйти");

        }

    }

}

//Серилизация изучить и сделать в проге. сроки: завтра.
//десирилизация