package utils;

import java.io.EOFException;
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
        } catch (EOFException e) {
            System.out.println(fileName + " File is empty");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

}
