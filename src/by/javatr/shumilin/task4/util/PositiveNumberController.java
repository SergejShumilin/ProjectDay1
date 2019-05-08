package by.javatr.shumilin.task4.util;

import by.javatr.shumilin.scanner.ScannerOfDate;

import java.util.stream.Stream;

public class PositiveNumberController {
    public static boolean isTwoPositiveNumbers() {
        int a = ScannerOfDate.getInteger();
        int b = ScannerOfDate.getInteger();
        int c = ScannerOfDate.getInteger();
        int d = ScannerOfDate.getInteger();

        long count = Stream.of(a, b, c, d)
                .filter(i -> i % 2 == 0)
                .count();

        return count>1 ? true : false;
    }
}
