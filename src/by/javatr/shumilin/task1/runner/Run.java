package by.javatr.shumilin.task1.runner;

import by.javatr.shumilin.task1.service.ConsoleService;
import by.javatr.shumilin.task1.util.SquareOfNumber;

import static by.javatr.shumilin.scanner.CommonConstants.ASK_MESSAGE;
import static by.javatr.shumilin.scanner.CommonConstants.ERROR_MESSAGE;

public class Run {
    public static ConsoleService service = new ConsoleService();

    public static void main(String[] args) {
        int number = service.getValue(ASK_MESSAGE, ERROR_MESSAGE);
        int value = SquareOfNumber.getLastDigitOfSquareNumber(number);
        System.out.printf("Последняя цифра квадрата последней цифры введенного числа равна %d",
                value);
    }
}
