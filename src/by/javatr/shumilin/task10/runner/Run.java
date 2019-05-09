package by.javatr.shumilin.task10.runner;

import by.javatr.shumilin.task10.service.ConsoleService;
import by.javatr.shumilin.task10.util.CounterOfFunction;

import java.util.Map;

import static by.javatr.shumilin.scanner.CommonConstants.ASK_MESSAGE;
import static by.javatr.shumilin.scanner.CommonConstants.ERROR_MESSAGE;

public class Run {
    public static ConsoleService service = new ConsoleService();

    public static void main(String[] args) {
        int a = service.getValue(ASK_MESSAGE, ERROR_MESSAGE);
        int b = service.getValue(ASK_MESSAGE, ERROR_MESSAGE);
        int h = service.getValue(ASK_MESSAGE, ERROR_MESSAGE);
        Map<Double, Double> functionValue = CounterOfFunction.getFunctionValue(a, b, h);
        System.out.println(String.format("%15s  %10s \t \n", "Значение аргумента", "Значение функции"));
        for (Map.Entry<Double, Double> entry : functionValue.entrySet()) {
            System.out.println(String.format(" %10s  %25s \t \n", entry.getKey(), entry.getValue()));
        }
    }
}
