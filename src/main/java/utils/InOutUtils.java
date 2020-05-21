package utils;

import java.util.Scanner;

public class InOutUtils {
    public static int getInt() {
        Scanner scanner = new Scanner(System.in);

        int result = scanner.nextInt();
        scanner.nextLine();
        return result;
    }

    public static String getLine() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
