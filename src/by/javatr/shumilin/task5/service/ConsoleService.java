package by.javatr.shumilin.task5.service;

import by.javatr.shumilin.scanner.AbstractConsoleService;

import java.util.regex.Pattern;

import static by.javatr.shumilin.scanner.CommonConstants.THREE_DIGIT_NUMBER_REGEX;

public class ConsoleService extends AbstractConsoleService {
    @Override
    public boolean isValid() {
        return SCANNER.hasNext(Pattern.compile(THREE_DIGIT_NUMBER_REGEX));
    }
}
