package by.javatr.shumilin.task9.runner;

import by.javatr.shumilin.scanner.ScannerOfDate;
import by.javatr.shumilin.task9.util.CounterParametersOfCircle;

public class Run {
    public static void main(String[] args) {
        int radius = ScannerOfDate.getInteger();
        int circumferenceCircle = (int) CounterParametersOfCircle.getCircumferenceCircle(radius);
        int squareCircle = (int) CounterParametersOfCircle.getSquareCircle(radius);
        System.out.printf("Длина окружности %d, Площадь окружности %d", circumferenceCircle, squareCircle);
    }
}
