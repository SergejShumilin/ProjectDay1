package by.javatr.shumilin.task7.util;

import org.junit.Assert;
import org.junit.Test;

public class NearestPointTest {

    @Test
    public void getNearestPointTest_A_Nearest() {
        String expected = "Точка A ближе к началу координат";

        String actual = NearestPoint.getNearestPoint(1, 2, 4, 3);
        boolean b = expected.equals(actual);

        Assert.assertTrue(b);
    }
}