package by.javatr.shumilin.task4.util;

import org.junit.Assert;
import org.junit.Test;

public class PositiveNumberControllerTest {

    @Test
    public void isTwoPositiveNumbersTest_Get_False() {

        Assert.assertFalse(PositiveNumberController.isTwoPositiveNumbers(1,3,5, 6));
    }

    @Test
    public void isTwoPositiveNumbersTest_GET_True() {

        Assert.assertTrue(PositiveNumberController.isTwoPositiveNumbers(1,4,5, 6));
    }
}