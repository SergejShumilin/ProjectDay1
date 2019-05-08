package by.javatr.shumilin.task6.util;


public class CounterOfTime {
    public static int getHour(int second) {
        return second / 3600;
    }

    public static int getMinute(int second) {
        return second / 60;
    }

    public static int getSecond(int second) {
        return second % 3600;
    }
}
