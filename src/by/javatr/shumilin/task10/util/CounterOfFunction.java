package by.javatr.shumilin.task10.util;

import java.util.HashMap;
import java.util.Map;

public class CounterOfFunction {
    public static Map<Double, Double> getFunctionValue(double a, double b, double h) {
        Map<Double, Double> map = new HashMap<>();
        for (double i = a; i <= b; i += h) {
            map.put(i, Math.tan(i));
        }
        return map;
    }
}
