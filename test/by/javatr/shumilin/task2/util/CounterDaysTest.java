package by.javatr.shumilin.task2.util;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CounterDaysTest {

    @Test
    public void getCountDays_Leap_Year() {
        int year = 2000;
        int month = 2;

        int expected = 29;

        int actual = CounterDays.getCountDays(year, month);
        Assert.assertEquals(expected, actual);
    }
}