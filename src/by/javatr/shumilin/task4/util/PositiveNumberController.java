package by.javatr.shumilin.task4.util;

import java.util.stream.Stream;

public class PositiveNumberController {

    public static boolean isTwoPositiveNumbers(int a, int b, int c, int d) {
                long count = Stream.of(a, b, c, d)
                .filter(i -> i % 2 == 0)
                .count();

        return count>1 ? true : false;
    }
}
