package by.javatr.shumilin.task10.util;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

public class CounterOfFunctionTest {

    @Test
    public void getFunctionValue_Not_Null() {

        double expected = 1.55;
        Double actual = 0.0;

        Map<Double, Double> functionValue = CounterOfFunction.getFunctionValue(1, 2, 2);
        for (Map.Entry<Double, Double> entry : functionValue.entrySet()) {
            actual = entry.getValue();
        }

        Assert.assertEquals(expected, actual, 0.1);
        }
    }