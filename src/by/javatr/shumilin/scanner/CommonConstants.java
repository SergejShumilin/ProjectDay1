package by.javatr.shumilin.scanner;

public class CommonConstants {
    public CommonConstants() {
    }

    public static final String ASK_MESSAGE = "Введите положительное число:";
    public static final String ERROR_MESSAGE = "Данные не корректны!";
    public static final String ASK_THREE_DIGIT_NUMBER = "Введите трехзначное число:";

    public static final String NUMBER_MONTH_REGEX = "[1-9]|1[0-2]";
    public static final String POSITIVE_NUMBER_REGEX = "[1-9][0-9]*";
    public static final String THREE_DIGIT_NUMBER_REGEX = "[1-9][0-9][0-9]";
    public static final String SECOND_REGEX = "(\\d{1,4}|[0-7]\\d{4}|8[0-5]\\d{3}|86[1-3]\\d{2}|86400)";
}
