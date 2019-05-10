package by.javatr.shumilin.scanner;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CommonConstantsTest {

    @Test
    public void positiveNumberRegexTest_Input_Positive_Number(){
        String positiveNumberRegex = CommonConstants.POSITIVE_NUMBER_REGEX;
        String input = "23";
        assertTrue(input.matches(positiveNumberRegex));

    }

    @Test
    public void positiveNumberRegexTest_Input_Negative_Number(){
        String positiveNumberRegex = CommonConstants.POSITIVE_NUMBER_REGEX;
        String input = "-3";
        assertFalse(input.matches(positiveNumberRegex));

    }

    @Test
    public void positiveNumberRegexTest_Input_String(){
        String positiveNumberRegex = CommonConstants.POSITIVE_NUMBER_REGEX;
        String input = "w";
        assertFalse(input.matches(positiveNumberRegex));

    }

    @Test
    public void getNumberMonthRegexTest_Input_Correct_Number(){
        String numberMonthRegex = CommonConstants.NUMBER_MONTH_REGEX;
        String input = "2";
        assertTrue(input.matches(numberMonthRegex));
    }

    @Test
    public void getNumberMonthRegexTest_Input_Incorrect_Number(){
        String numberMonthRegex = CommonConstants.NUMBER_MONTH_REGEX;
        String input = "14";
        assertFalse(input.matches(numberMonthRegex));
    }

    @Test
    public void getThreeDigitNumberRegexTest_Input_Incorrect_Number(){
        String threeDigitNumberRegex = CommonConstants.THREE_DIGIT_NUMBER_REGEX;
        String input = "14";
        assertFalse(input.matches(threeDigitNumberRegex));
    }

    @Test
    public void getThreeDigitNumberRegexTest_Input_Correct_Number(){
        String threeDigitNumberRegex = CommonConstants.THREE_DIGIT_NUMBER_REGEX;
        String input = "124";
        assertTrue(input.matches(threeDigitNumberRegex));
    }

    @Test
    public void getSecondRegexTest_Input_Correct_Number(){
        String second = CommonConstants.SECOND_REGEX;
        String input = "124";
        assertTrue(input.matches(second));
    }

    @Test
    public void getSecondRegexTest_Input_Incorrect_Number(){
        String second = CommonConstants.SECOND_REGEX;
        String input = "-3";
        assertFalse(input.matches(second));
    }
}