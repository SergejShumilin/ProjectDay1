package by.javatr.shumilin.task5.util;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ThreeDigitNumberControllerTest {

    @Test
    public void isSquareNumberEqualsCubeOfSumNumbers_Get_False() {

        Assert.assertFalse(ThreeDigitNumberController.isSquareNumberEqualsCubeOfSumNumbers(234));

    }
}