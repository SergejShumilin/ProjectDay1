package by.javatr.shumilin.task5.runner;

import by.javatr.shumilin.scanner.ScannerOfDate;
import by.javatr.shumilin.task5.util.ThreeDigitNumberController;

public class Run {
    public static void main(String[] args) {
        long threeDigitNumber = ScannerOfDate.getThreeDigitNumber();
        System.out.println("Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа? "
                + ThreeDigitNumberController.isSquareNumberEqualsCubeOfSumNumbers(threeDigitNumber));
    }
}
