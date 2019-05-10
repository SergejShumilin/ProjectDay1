package by.javatr.shumilin.task9.util;

import org.junit.Assert;
import org.junit.Test;

public class CounterParametersOfCircleTest {

    @Test
    public void getCircumferenceCircleTest_Not_Null() {
        int radius = 6;

        double expected = 37.68;
        double actual = CounterParametersOfCircle.getCircumferenceCircle(radius);

        Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void getSquareCircleTest_Not_Null() {
        int radius = 6;

        double expected = 113.04;
        double actual = CounterParametersOfCircle.getSquareCircle(radius);

        Assert.assertEquals(expected, actual, 0.1);
    }
}