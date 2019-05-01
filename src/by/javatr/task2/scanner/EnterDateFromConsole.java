package by.javatr.task2.scanner;

import java.util.Scanner;

public class EnterDateFromConsole {
    private static Scanner scanner = new Scanner(System.in);
    private static int year;
    private static int month;

    public static int getYear() {
        System.out.println("Введите год:");
        if (scanner.hasNextInt()) {
            year = scanner.nextInt();
        } else {
            System.out.println("Данные не верны");
        }
        return year;
    }

    public static int getMonth(){
        System.out.println("Введите номер месяца:");
        while (scanner.hasNextInt()){
            if (scanner.nextInt()>0 && scanner.nextInt()<13){
                month = scanner.nextInt();
            } else {
                System.out.println("Данные не верны");
            }
        }
        return month;
    }
}
