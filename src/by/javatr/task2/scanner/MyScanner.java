package by.javatr.task2.scanner;

import java.util.Scanner;

public class MyScanner {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static int getYear() throws Exception {
        int year = 0;
        System.out.println("Введите год:");
        if (SCANNER.hasNextInt()) {
            int i = SCANNER.nextInt();
            if (i > 0) {
                year = i;
            } else {
                throw new Exception();
            }
        }
        return year;
    }

    public static int getMonth() throws Exception {
        int month = 0;
        System.out.println("Введите номер месяца:");
        if (SCANNER.hasNextInt()) {
            int i = SCANNER.nextInt();
            if (i > 0 && i < 13) {
                month = i;
            } else {
                throw new Exception();
            }
        }
        return month;
    }
}
