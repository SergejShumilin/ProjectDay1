package by.javatr.shumilin.task7.util;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NearestPointTest {

    @Test
    public void getNearestPoint_A() {
        String expected = "Точка A ближе к началу координат";

        String actual = NearestPoint.getNearestPoint(1, 2, 4, 3);
        boolean b = expected.equals(actual);

        Assert.assertTrue(b);
    }
}