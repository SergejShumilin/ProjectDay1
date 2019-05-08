package by.javatr.shumilin.task1.runner;

import by.javatr.shumilin.scanner.ScannerOfDate;
import by.javatr.shumilin.task1.util.SquareOfNumber;

public class Run {
    public static void main(String[] args) {
        int number = ScannerOfDate.getInteger();
        System.out.printf("Последняя цифра квадрата последней цифры введенного числа равна %d",
                SquareOfNumber.getLastDigitOfSquareNumber(number));
    }
}
