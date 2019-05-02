package by.javatr.task4.scanner;

import java.util.Scanner;

public class MyScanner {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static int[] getArrayInt() {
        int[] arr = new int[4];
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        System.out.println("Введите числа:");
        if (SCANNER.hasNextInt()) {
            a = SCANNER.nextInt();
            b = SCANNER.nextInt();
            c = SCANNER.nextInt();
            d = SCANNER.nextInt();
        }
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        arr[3] = d;
        return arr;
    }
}
