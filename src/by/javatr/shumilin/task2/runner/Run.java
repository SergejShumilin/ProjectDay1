package by.javatr.shumilin.task2.runner;

import by.javatr.shumilin.scanner.ScannerOfDate;
import by.javatr.shumilin.task2.util.CounterDays;

public class Run {
    public static void main(String[] args) {
        int year = ScannerOfDate.getInteger();
        int month = ScannerOfDate.getMonth();
        System.out.printf("Количество дней равно %d",  CounterDays.getCountDays(year, month));
    }
}
