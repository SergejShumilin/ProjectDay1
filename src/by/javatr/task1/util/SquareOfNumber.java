package by.javatr.task1.util;

import by.javatr.scanner.EnterFromConsole;

public class SquareOfNumber {
    private static double squareNumber;

    public static void getSquareOfNumber() {
        double enteredNumber = EnterFromConsole.enterDouble();
        squareNumber = enteredNumber % 10;
        System.out.println("Последняя цифра введенного числа:" + squareNumber);
        double squareLastNumber = squareNumber * squareNumber;
        System.out.println("Квадрат последней цифры введенного числа:" + squareLastNumber);
    }
}
