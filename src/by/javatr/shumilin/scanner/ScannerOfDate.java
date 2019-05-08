package by.javatr.shumilin.scanner;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ScannerOfDate {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static int getInteger() {
        System.out.println("Введите положительное число: ");
        while (!SCANNER.hasNext(Pattern.compile("[1-9][0-9]*"))) {
            System.out.println("Данные не корректны! Введите положительное число: ");
            SCANNER.next();
        }
        return SCANNER.nextInt();
    }

    public static int getMonth() {
        System.out.println("Введите номер месяца: ");
        while (!SCANNER.hasNext(Pattern.compile("[1-9]|1[0-2]"))) {
            System.out.println("Данные не корректны! Введите номер месяца: ");
            SCANNER.next();
        }
        return SCANNER.nextInt();
    }

    public static long getThreeDigitNumber() {
        System.out.println("Введите трехзначное число: ");
        while (!SCANNER.hasNext(Pattern.compile("[1-9][0-9][0-9]"))) {
            System.out.println("Это не трехзначное число! Введите трехзначное число: ");
            SCANNER.next();
        }
        return SCANNER.nextLong();
    }

    public static int getSeconds() {
        System.out.println("Введите текущую секунду суток: ");
        while (!SCANNER.hasNext(Pattern.compile("(\\d{1,4}|[0-7]\\d{4}|8[0-5]\\d{3}|86[1-3]\\d{2}|86400)"))) {
            System.out.println("В сутках 86400 секунд. Введите текущую секунду суток: ");
            SCANNER.next();
        }
        return SCANNER.nextInt();
    }
}

