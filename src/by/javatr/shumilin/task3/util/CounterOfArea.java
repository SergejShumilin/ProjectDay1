package by.javatr.shumilin.task3.util;

public class CounterOfArea {

    public static int getAreaOfSquareInsideCircle(int areaOfSquareOutsideCircle) {
        int radiusCircle = (int) Math.sqrt(areaOfSquareOutsideCircle) / 2;
        int diagonalSquareInsideCircle = radiusCircle * 2;
        return diagonalSquareInsideCircle * diagonalSquareInsideCircle / 2;
    }

    public static int getDifferentBetweenSquares(int areaOfSquareOutsideCircle, int areaOfSquareInsideCircle) {
        return areaOfSquareOutsideCircle / areaOfSquareInsideCircle;
    }
}
