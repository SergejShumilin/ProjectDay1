package by.javatr.shumilin.task6.service;

import by.javatr.shumilin.scanner.AbstractConsoleService;

import java.util.regex.Pattern;

import static by.javatr.shumilin.scanner.CommonConstants.SECOND_REGEX;

public class ConsoleService extends AbstractConsoleService {
    @Override
    public boolean isValid() {
        return SCANNER.hasNext(Pattern.compile(SECOND_REGEX));
    }
}
