package by.javatr.shumilin.task6.runner;

import by.javatr.shumilin.task6.service.ConsoleService;
import by.javatr.shumilin.task6.util.CounterOfTime;

import static by.javatr.shumilin.scanner.CommonConstants.ASK_MESSAGE;
import static by.javatr.shumilin.scanner.CommonConstants.ERROR_MESSAGE;

public class Run {

    public static ConsoleService service = new ConsoleService();

    public static void main(String[] args) {
        int second = service.getValue(ASK_MESSAGE, ERROR_MESSAGE);
        System.out.printf("%d часов, %d минут, %d секунд",
                CounterOfTime.getHour(second), CounterOfTime.getMinute(second), CounterOfTime.getSecond(second));
    }
}
