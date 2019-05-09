package by.javatr.shumilin.task9.runner;

import by.javatr.shumilin.task9.service.ConsoleService;
import by.javatr.shumilin.task9.util.CounterParametersOfCircle;

import static by.javatr.shumilin.scanner.CommonConstants.ASK_MESSAGE;
import static by.javatr.shumilin.scanner.CommonConstants.ERROR_MESSAGE;

public class Run {
    public static ConsoleService service = new ConsoleService();

    public static void main(String[] args) {
        int radius = service.getValue(ASK_MESSAGE, ERROR_MESSAGE);
        double circumferenceCircle = CounterParametersOfCircle.getCircumferenceCircle(radius);
        double squareCircle = CounterParametersOfCircle.getSquareCircle(radius);
        System.out.println("Длина окружности " + circumferenceCircle);
        System.out.println("Площадь окружности " + squareCircle);
    }
}
