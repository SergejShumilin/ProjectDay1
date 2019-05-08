package by.javatr.shumilin.task8.runner;

import by.javatr.shumilin.scanner.ScannerOfDate;
import by.javatr.shumilin.task8.util.CounterOfFunction;

public class Run {
    public static void main(String[] args) {
        int x = ScannerOfDate.getInteger();
        System.out.println(CounterOfFunction.getValueFunction(x));
    }
}
