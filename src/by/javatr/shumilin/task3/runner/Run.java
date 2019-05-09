package by.javatr.shumilin.task3.runner;

import by.javatr.shumilin.task3.service.ConsoleService;
import by.javatr.shumilin.task3.util.CounterOfArea;

import static by.javatr.shumilin.scanner.CommonConstants.ASK_MESSAGE;
import static by.javatr.shumilin.scanner.CommonConstants.ERROR_MESSAGE;


public class Run {
    public static ConsoleService service = new ConsoleService();

    public static void main(String[] args) {
        int areaOfSquareOutsideCircle = service.getValue(ASK_MESSAGE, ERROR_MESSAGE);
        int areaOfSquareInsideCircle = CounterOfArea.getAreaOfSquareInsideCircle(areaOfSquareOutsideCircle);
        int differentBetweenSquares = CounterOfArea.getDifferentBetweenSquares(areaOfSquareOutsideCircle, areaOfSquareInsideCircle);
        System.out.printf("Площадь квадрата вписанного в окружность %d, площадь вписанного квадрата меньше площади заданного в %d раза ",
                areaOfSquareInsideCircle, differentBetweenSquares);

    }
}
