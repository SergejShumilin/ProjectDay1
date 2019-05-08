package by.javatr.shumilin.task7.util;

import by.javatr.shumilin.scanner.ScannerOfDate;

public class NearestPoint {
    public static String getNearestPoint() {

        int x1 = ScannerOfDate.getInteger();
        int y1 = ScannerOfDate.getInteger();
        int x2 = ScannerOfDate.getInteger();
        int y2 = ScannerOfDate.getInteger();

        int i = (x1*x1)+(y1*y1);
        int k = (x2*x2)+(y2*y2);

        return i > k ? "Точка B ближе к началу координат." : "Точка A ближе к началу координат";
    }
}
