package by.javatr.shumilin.task8.service;

import by.javatr.shumilin.scanner.AbstractConsoleService;

import java.util.regex.Pattern;

import static by.javatr.shumilin.scanner.CommonConstants.POSITIVE_NUMBER_REGEX;

public class ConsoleService extends AbstractConsoleService {
    @Override
    public boolean isValid() {
        return SCANNER.hasNext(Pattern.compile(POSITIVE_NUMBER_REGEX));
    }
}
