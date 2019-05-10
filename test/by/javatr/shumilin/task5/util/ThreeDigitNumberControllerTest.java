package by.javatr.shumilin.task5.util;

import org.junit.Assert;
import org.junit.Test;

public class ThreeDigitNumberControllerTest {

    @Test
    public void isSquareNumberEqualsCubeOfSumNumbersTest_Get_False() {

        Assert.assertFalse(ThreeDigitNumberController.isSquareNumberEqualsCubeOfSumNumbers(234));

    }
}