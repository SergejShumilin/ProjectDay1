package by.javatr.shumilin.task1.util;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareOfNumberTest {

    @Test
    public void getLastDigitOfSquareNumber_Positive_Number() {
        int number = 17;

        int expected = 9;

        int actual = SquareOfNumber.getLastDigitOfSquareNumber(number);
        Assert.assertEquals(expected, actual);

    }
}