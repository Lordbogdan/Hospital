import Doctor.Doctor;
import Patient.Patient;
import Recipe.Recipe;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Patient v1 = new Patient("Vlad", "Egorenko", "Alekseevich", 838383);
        Patient v2 = new Patient("Kolya", "Ivanov", "Andreevich", 676767);
        Patient v3 = new Patient("Nikita", "Ivanenko", "Afonasievich", 676767);
        Doctor a1 = new Doctor("Andrey", "Matveev", "Borisovich", "Surgeon");
        Doctor a2 = new Doctor("Masha", "Markova", "Bogdanovna", "Surgeon");
        Doctor a3 = new Doctor("Dasha", "Marikova", "Vasina", "Surgeon");
        Recipe r1 = new Recipe("recipe", "fracture", 21, 22, "Normal");
        Recipe r2 = new Recipe("recipe", "fracture", 21, 22, "Normal");
        Recipe r3 = new Recipe("recipe", "fracture", 21, 22, "Normal");
        System.out.println("Регистрация");


        Scanner scanner = new Scanner(System.in);

        String x = scanner.nextLine();
        String z = scanner.nextLine();
        if (x == "Зарегистрировать врача") {
            System.out.println("Введите данные врача:");
        }
        else if (z == "Зарегистрировать пациента") {
            System.out.println("Введите данные пациента:");
        }
        else {
            System.out.println("Выйти");

        }
    }
}