package by.javatr.shumilin.task3.util;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CounterOfAreaTest {

    @Test
    public void getAreaOfSquareInsideCircle_Return_Area() {
        int number = 36;

        int expected = 18;

        int actual = CounterOfArea.getAreaOfSquareInsideCircle(number);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDifferentBetweenSquares_Return_Different() {
        int areaSquareOutside = 36;

        int areaSquareInside = 18;

        int expected = 2;

        int actual = CounterOfArea.getDifferentBetweenSquares(areaSquareOutside, areaSquareInside);
        Assert.assertEquals(expected, actual);
    }
}