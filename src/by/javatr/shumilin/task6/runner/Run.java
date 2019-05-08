package by.javatr.shumilin.task6.runner;

import by.javatr.shumilin.scanner.ScannerOfDate;
import by.javatr.shumilin.task6.util.CounterOfTime;

public class Run {
    public static void main(String[] args) {
        int second = ScannerOfDate.getSeconds();
        System.out.printf("%d часов, %d минут, %d секунд",
                CounterOfTime.getHour(second), CounterOfTime.getMinute(second), CounterOfTime.getSecond(second));
    }
}
