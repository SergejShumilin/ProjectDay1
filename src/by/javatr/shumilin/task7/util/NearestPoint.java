package by.javatr.shumilin.task7.util;

public class NearestPoint {

    public static String getNearestPoint(int x1, int y1, int x2, int y2) {
        int i = (x1*x1)+(y1*y1);
        int k = (x2*x2)+(y2*y2);

        return i > k ? "Точка B ближе к началу координат." : "Точка A ближе к началу координат";
    }
}
