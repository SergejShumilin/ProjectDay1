package by.javatr.shumilin.task8.util;

public class CounterOfFunction {
    public static double getValueFunction(int x) {
        if (x > 3) {
            x = (int) -Math.pow(x, 2) + 3 * x + 9;
        } else {
            x = 1 / (int) (Math.pow(x, 3) - 6);
        }

        return x;
    }
}
