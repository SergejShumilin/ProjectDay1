package by.javatr.shumilin.task5.runner;

import by.javatr.shumilin.task5.service.ConsoleService;
import by.javatr.shumilin.task5.util.ThreeDigitNumberController;

import static by.javatr.shumilin.scanner.CommonConstants.ASK_THREE_DIGIT_NUMBER;
import static by.javatr.shumilin.scanner.CommonConstants.ERROR_MESSAGE;

public class Run {
    public static ConsoleService service = new ConsoleService();

    public static void main(String[] args) {
        long threeDigitNumber = service.getValue(ASK_THREE_DIGIT_NUMBER, ERROR_MESSAGE);
        boolean squareNumberEqualsCubeOfSumNumbers = ThreeDigitNumberController.isSquareNumberEqualsCubeOfSumNumbers(threeDigitNumber);
        System.out.println("Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа? "
                + squareNumberEqualsCubeOfSumNumbers);
    }
}
