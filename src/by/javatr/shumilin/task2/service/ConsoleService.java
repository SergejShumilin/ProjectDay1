package by.javatr.shumilin.task2.service;

import by.javatr.shumilin.scanner.AbstractConsoleService;

import java.util.regex.Pattern;

import static by.javatr.shumilin.scanner.CommonConstants.NUMBER_MONTH_REGEX;

public class ConsoleService extends AbstractConsoleService {

    public int getYear(String askMessage, String errorMessage) {
        write(askMessage);
        while (!SCANNER.hasNext(Pattern.compile("[1-9][0-9]*"))) {
            write(errorMessage);
            SCANNER.next();
        }
        return SCANNER.nextInt();
    }

    @Override
    public boolean isValid() {
        return SCANNER.hasNext(Pattern.compile(NUMBER_MONTH_REGEX));
    }
}
