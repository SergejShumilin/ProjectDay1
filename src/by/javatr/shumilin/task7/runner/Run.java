package by.javatr.shumilin.task7.runner;

import by.javatr.shumilin.task7.service.ConsoleService;
import by.javatr.shumilin.task7.util.NearestPoint;

import static by.javatr.shumilin.scanner.CommonConstants.ASK_MESSAGE;
import static by.javatr.shumilin.scanner.CommonConstants.ERROR_MESSAGE;

public class Run {
    public static ConsoleService service = new ConsoleService();

    public static void main(String[] args) {
        int x1 = service.getValue(ASK_MESSAGE, ERROR_MESSAGE);
        int y1 = service.getValue(ASK_MESSAGE, ERROR_MESSAGE);
        int x2 = service.getValue(ASK_MESSAGE, ERROR_MESSAGE);
        int y2 = service.getValue(ASK_MESSAGE, ERROR_MESSAGE);
        String nearestPoint = NearestPoint.getNearestPoint(x1, y1, x2, y2);
        System.out.println(nearestPoint);
    }
}
