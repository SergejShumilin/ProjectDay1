package by.javatr.task2.util;

import by.javatr.task2.scanner.MyScanner;

public class CounterDays {

    public static void getCountDays() throws Exception {
        int year = MyScanner.getYear();
        int month = MyScanner.getMonth();
        if (year % 4 != 0 || year % 100 == 0 && year % 400 != 0) {
            System.out.println("Обычный год");
            switch (month){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("31");
                break;
                case 2:System.out.println("28");
                break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("30");
                break;
            }
        } else {
            System.out.println("Високосный год");
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("31");
                    break;
                case 2:
                    System.out.println("29");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("30");
                    break;
            }
        }
    }
}
