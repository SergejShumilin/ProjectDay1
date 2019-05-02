package by.javatr.task1.util;

import by.javatr.scanner.MyScanner;

public class SquareOfNumber {

    public static void getSquareOfNumber() {
        double enteredNumber = MyScanner.enterDouble();
        double lastNumber = enteredNumber % 10;
        System.out.println("Последняя цифра введенного числа:" + lastNumber);
        double squareLastNumber = lastNumber * lastNumber;
        System.out.println("Квадрат последней цифры введенного числа:" + squareLastNumber);
        double lastNumberSquare = squareLastNumber % 10;
        System.out.println("Последняя цифра квадрата числа: " + lastNumberSquare);
    }
}
