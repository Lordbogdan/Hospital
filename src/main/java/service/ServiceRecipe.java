package service;

import entity.Doctor;
import entity.Patient;
import entity.Recipe;
import utils.FileUtils;

import java.io.File;
import java.io.FileOutputStream;

import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiceRecipe {
    ArrayList<Recipe> recipeArrayList;
    ServicePatient sp = new ServicePatient();
    ServiceDoctor sd = new ServiceDoctor();


    public ServiceRecipe() {
        this.recipeArrayList = FileUtils.<Recipe>readFromFile("Recipe");
        System.out.println();
    }


    public void createNewRecipe(Scanner scanner) throws Exception {
        System.out.println("Test Recipe 1");
        Recipe newRecipe = new Recipe();
        File newFile = new File("Recipe");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(newFile));


        newRecipe.setId(recipeArrayList.size() + 1);
        System.out.print("Введите описание рецепта: ");
        newRecipe.setDescription(scanner.nextLine());
        System.out.print("Введите дату регистрации рецепта: ");
        newRecipe.setData(scanner.nextLine());
        System.out.print("Укажите id пациента: ");
        newRecipe.setPatient(sp.getPatient(scanner.nextInt()));
        System.out.print("Укажите id врача: ");
        scanner.nextLine();
        newRecipe.setDoctor(sd.getDoctor(scanner.nextInt()));
        scanner.nextLine();
        System.out.print("Укажите состояние пациента Hard, Medium, Easy: ");
        newRecipe.setPriority(scanner.nextLine());

        recipeArrayList.add(newRecipe);

        oos.writeObject(recipeArrayList);
        oos.close();

    }

    public void showAllPatient() {

        System.out.println("Список рецептов");
        recipeArrayList.forEach(recipe -> {
            System.out.println("Patient " + recipe);
        });
    }

    public void showAllDoctor() {
        System.out.println("Список рецептов");
        recipeArrayList.forEach(doctor -> {
            System.out.println("Doctor " + doctor);
        });
    }
}