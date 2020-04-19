package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class FileUtils {

    public static <T> ArrayList<T> readFromFile(String fileName) {
        ArrayList<T> list;
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(fileName)));
            list = (ArrayList<T>) ois.readObject();
            return list;
        } catch (Exception e) {
            System.out.println("File is empty");
        }
        return new ArrayList<>();
    }

    public static String readLine() {
        return null;
    }

    public static int readInt() {
        return 0;
    }
}


// задание сделать для сервиса интерфейс с реализацией