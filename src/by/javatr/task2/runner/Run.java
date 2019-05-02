package by.javatr.task2.runner;

import by.javatr.task2.util.CounterDays;

public class Run {
    public static void main(String[] args) {
        try {
            CounterDays.getCountDays();
        } catch (Exception e) {
            System.out.println("Введенные данные не верны");
        }
    }
}
