package by.javatr.shumilin.task4.runner;

import by.javatr.shumilin.task4.service.ConsoleService;
import by.javatr.shumilin.task4.util.PositiveNumberController;

import static by.javatr.shumilin.scanner.CommonConstants.ASK_MESSAGE;
import static by.javatr.shumilin.scanner.CommonConstants.ERROR_MESSAGE;

public class Run {
    public static ConsoleService service = new ConsoleService();

    public static void main(String[] args) {
        int a = service.getValue(ASK_MESSAGE, ERROR_MESSAGE);
        int b = service.getValue(ASK_MESSAGE, ERROR_MESSAGE);
        int c = service.getValue(ASK_MESSAGE, ERROR_MESSAGE);
        int d = service.getValue(ASK_MESSAGE, ERROR_MESSAGE);
        System.out.println(PositiveNumberController.isTwoPositiveNumbers(a, b, c, d));
    }
}
