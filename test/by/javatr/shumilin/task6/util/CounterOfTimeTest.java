package by.javatr.shumilin.task6.util;

import org.junit.Assert;
import org.junit.Test;

public class CounterOfTimeTest {

    @Test
    public void getHourTest_Not_Null() {
        int second = 5687;

        int expected = 1;
        int actual = CounterOfTime.getHour(second);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMinuteTest_Not_Null() {
        int second = 5687;
        int expected = 94;
        int actual = CounterOfTime.getMinute(second);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSecondTest_Not_Null() {
        int second = 5687;
        int expected = 2087;
        int actual = CounterOfTime.getSecond(second);

        Assert.assertEquals(expected, actual);
    }
}