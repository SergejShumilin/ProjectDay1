package by.javatr.shumilin.task8.util;

import org.junit.Assert;
import org.junit.Test;

public class CounterOfFunctionTest {

    @Test
    public void getValueFunctionTest_Number_More_Three() {
        int number = 8;
        double expected = -31.0;
        double actual = CounterOfFunction.getValueFunction(number);

        Assert.assertEquals(expected, actual, 0);
    }
}