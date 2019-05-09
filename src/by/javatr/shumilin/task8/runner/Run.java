package by.javatr.shumilin.task8.runner;

import by.javatr.shumilin.task8.service.ConsoleService;
import by.javatr.shumilin.task8.util.CounterOfFunction;

import static by.javatr.shumilin.scanner.CommonConstants.ASK_MESSAGE;
import static by.javatr.shumilin.scanner.CommonConstants.ERROR_MESSAGE;

public class Run {
    public static ConsoleService service = new ConsoleService();

    public static void main(String[] args) {
        int value = service.getValue(ASK_MESSAGE, ERROR_MESSAGE);
        double valueFunction = CounterOfFunction.getValueFunction(value);
        System.out.println(valueFunction);
    }
}
