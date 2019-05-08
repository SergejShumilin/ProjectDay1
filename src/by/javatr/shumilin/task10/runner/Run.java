package by.javatr.shumilin.task10.runner;

import by.javatr.shumilin.task10.util.CounterOfFunction;

import java.util.Map;

public class Run {
    public static void main(String[] args) {
        Map<Double, Double> functionValue = CounterOfFunction.getFunctionValue();
        System.out.println(String.format("%15s  %10s \t \n", "Значение аргумента", "Значение функции"));
        for (Map.Entry<Double, Double> entry : functionValue.entrySet()) {
            System.out.println(String.format(" %10s  %28s \t \n", entry.getKey(), entry.getValue()));
        }
    }
}
