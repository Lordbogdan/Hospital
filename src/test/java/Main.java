import entity.Patient;
import service.ServiceDoctor;
import service.ServicePatient;
import utils.FileUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        ServiceDoctor serviceDoctor = new ServiceDoctor();
        ServicePatient servicePatient = new ServicePatient();
        System.out.println("Registration");
        System.out.println("To register a doctor, enter 1");
        System.out.println("To register a patient, enter 2");
        System.out.println("Показать списки докторов, введите 3");
        System.out.println("Хотите выйти? Введите 10");

        while (true) {

            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            scanner.nextLine();


            if (x == 1) {
                serviceDoctor.createNewDoctor(scanner);

            } else if (x == 2) {
                servicePatient.createNewPatient(scanner);
            } else if (x == 3) {
                serviceDoctor.showAllDoctors();
            } else if (x == 4) {
                servicePatient.showAllPatient();
            } else if (x == 5) {

            } else if (x == 10) {
                System.out.println("Exit the programm");
                break;
            } else {
                System.out.println("Команда не найдена");


            }
        }
    }
}


