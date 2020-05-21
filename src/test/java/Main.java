
import service.ServiceDoctor;
import service.ServicePatient;
import service.ServiceRecipe;
import utils.InOutUtils;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        ServiceDoctor serviceDoctor = new ServiceDoctor();
        ServicePatient servicePatient = new ServicePatient();
        ServiceRecipe serviceRecipe = new ServiceRecipe();
        System.out.println("Registration");
        System.out.println("To register a doctor, enter 1");
        System.out.println("To register a patient, enter 2");
        System.out.println("Показать списки докторов, введите 3");
        System.out.println("Показать списки пациентов, введите 4");
        System.out.println("Тест списка рецептов цифра 5");
        System.out.println("Тест рецепта цифра 6");
        System.out.println("Хотите выйти? Введите 10");

        while (true) {

            System.out.print("Введите команду(0 - help): ");
            int x = InOutUtils.getInt();

            if (x == 1) {
                serviceDoctor.createNewDoctor();

            } else if (x == 2) {
                servicePatient.createNewPatient();
            } else if (x == 3) {
                serviceDoctor.showAllDoctors();
            } else if (x == 4) {
                servicePatient.showAllPatient();
            } else if (x == 5) {
                serviceRecipe.showAllPatient();
                serviceRecipe.showAllDoctor();

            } else if (x == 6) {
                serviceRecipe.createNewRecipe(new Scanner(System.in));
            } else if (x == 10) {
                System.out.println("Exit the programm");
                break;
            } else {
                System.out.println("Команда не найдена");


            }
        }
    }
}


