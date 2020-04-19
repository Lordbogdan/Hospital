package service;

import entity.Doctor;
import entity.Patient;
import entity.Recipe;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiceRecipe {
    ArrayList<Recipe> recipeArrayList;
    ServicePatient sp = new ServicePatient();

    public ServiceRecipe(ArrayList<Recipe> recipeArrayList) {
        this.recipeArrayList = recipeArrayList;
    }

    public void createNewRecipe(Scanner scanner) throws Exception {
        System.out.println("Test Recipe 1");
        Recipe newRecipe = new Recipe();
        File newFile = new File("Recipe");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(newFile));


        newRecipe.setId(recipeArrayList.size() + 1);

        newRecipe.setDescription(scanner.nextLine());
        newRecipe.setData(scanner.nextInt());
        scanner.nextLine();
        newRecipe.setPatient(sp.getPatient(scanner.nextInt()));
        scanner.nextLine();
        newRecipe.setDoctor(null); //todo доделать рецепт "сохарнить в файл"


    }

}
