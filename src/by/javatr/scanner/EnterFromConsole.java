package by.javatr.scanner;

import java.util.Scanner;

public class EnterFromConsole {
    private static Scanner scanner = new Scanner(System.in);
    private static double number;

    public static double enterDouble() {
        System.out.println("Введите число:");
        if (scanner.hasNextDouble()) {
            number = scanner.nextDouble();
            System.out.println("Вы ввели число:" + number);
        } else {
            System.out.println("Введенные данные не верны");
        }
        return number;
    }
}
