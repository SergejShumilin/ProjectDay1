package by.javatr.scanner;

import java.util.Scanner;

public class MyScanner {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static double enterDouble() {
        double number = 0.0;
        System.out.println("Введите число:");
        if (SCANNER.hasNextDouble()) {
            number = SCANNER.nextDouble();
            System.out.println("Вы ввели число:" + number);
        } else {
            System.out.println("Введенные данные не верны");
        }
        return number;
    }
}
