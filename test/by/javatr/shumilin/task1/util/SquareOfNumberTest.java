package by.javatr.shumilin.task1.util;

import org.junit.Assert;
import org.junit.Test;

public class SquareOfNumberTest {

    @Test
    public void getLastDigitOfSquareNumberTest_Positive_Number() {
        int number = 17;

        int expected = 9;

        int actual = SquareOfNumber.getLastDigitOfSquareNumber(number);
        Assert.assertEquals(expected, actual);

    }
}