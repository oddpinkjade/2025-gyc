package utils;

import java.time.LocalDate;
import java.util.Scanner;

public class InputUtils {

    private static final Scanner scanner = new Scanner(System.in);

    private InputUtils() {}

    public static String readLine(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static int readInt(String prompt) {
        System.out.print(prompt);
        int input = scanner.nextInt();
        scanner.nextLine();
        return input;
    }

    public static Long readLong(String prompt) {
        System.out.print(prompt);
        Long input = scanner.nextLong();
        scanner.nextLine();
        return input;
    }

    public static LocalDate readDate(String prompt) {
        System.out.print(prompt);
        String input = scanner.nextLine();
        return LocalDate.parse(input);
    }
}
