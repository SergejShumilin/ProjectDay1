package by.javatr.shumilin.task2.runner;

import by.javatr.shumilin.task2.service.ConsoleService;
import by.javatr.shumilin.task2.util.CounterDays;

import static by.javatr.shumilin.scanner.CommonConstants.ASK_MESSAGE;
import static by.javatr.shumilin.scanner.CommonConstants.ERROR_MESSAGE;

public class Run {
    public static ConsoleService service = new ConsoleService();

    public static void main(String[] args) {
        int year = service.getYear(ASK_MESSAGE, ERROR_MESSAGE);
        int month = service.getValue(ASK_MESSAGE, ERROR_MESSAGE);
        int countDays = CounterDays.getCountDays(year, month);

        System.out.printf("Количество дней равно %d",  countDays);
    }
}
