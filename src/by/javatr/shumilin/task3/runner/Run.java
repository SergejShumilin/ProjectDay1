package by.javatr.shumilin.task3.runner;

import by.javatr.shumilin.scanner.ScannerOfDate;
import by.javatr.shumilin.task3.util.CounterOfArea;


public class Run {
    public static void main(String[] args) {
        int areaOfSquareOutsideCircle = ScannerOfDate.getInteger();
        int areaOfSquareInsideCircle = CounterOfArea.getAreaOfSquareInsideCircle(areaOfSquareOutsideCircle);
        int differentBetweenSquares = CounterOfArea.getDifferentBetweenSquares(areaOfSquareOutsideCircle, areaOfSquareInsideCircle);
        System.out.printf("Площадь квадрата вписанного в окружность %d, площадь вписанного квадрата меньше площади заданного в %d раза ",
                areaOfSquareInsideCircle, differentBetweenSquares);

    }
}
