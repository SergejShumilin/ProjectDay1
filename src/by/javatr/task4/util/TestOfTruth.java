package by.javatr.task4.util;

import by.javatr.task4.scanner.MyScanner;

public class TestOfTruth {
    public static boolean getTrueOrFalse(){
        boolean test = true;
        int[] arrayInt = MyScanner.getArrayInt();
        int a = arrayInt[0];
        int b = arrayInt[1];
        int c = arrayInt[2];
        int d = arrayInt[3];
        System.out.println(a + " " + b + " " + c + " " + d);
        if(a % 2 == 0 && b %2 == 0 || a%2 == 0 && c%2==0 || a%2==0 && d%2==0 || b%2==0 && c%2==0 || b%2==0 && d%2==0 || c%2==0 && d%2==0){
            System.out.println(test);
            return test;
        } else {
            test = false;
            System.out.println(test);
            return test;
        }
    }
}
