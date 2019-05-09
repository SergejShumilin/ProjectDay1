package by.javatr.shumilin.scanner;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CommonConstantsTest {

    @Test
    public void positiveNumberRegex_Input_Positive_Number(){
        String positiveNumberRegex = CommonConstants.POSITIVE_NUMBER_REGEX;
        String input = "23";
        assertTrue(input.matches(positiveNumberRegex));

    }

    @Test
    public void positiveNumberRegex_Input_Negative_Number(){
        String positiveNumberRegex = CommonConstants.POSITIVE_NUMBER_REGEX;
        String input = "-3";
        assertFalse(input.matches(positiveNumberRegex));

    }

    @Test
    public void positiveNumberRegex_Input_String(){
        String positiveNumberRegex = CommonConstants.POSITIVE_NUMBER_REGEX;
        String input = "w";
        assertFalse(input.matches(positiveNumberRegex));

    }

    @Test
    public void getNumber_Month_Input_Correct_Number(){
        String numberMonthRegex = CommonConstants.NUMBER_MONTH_REGEX;
        String input = "2";
        assertTrue(input.matches(numberMonthRegex));
    }

    @Test
    public void getNumber_Month_Input_Incorrect_Number(){
        String numberMonthRegex = CommonConstants.NUMBER_MONTH_REGEX;
        String input = "14";
        assertFalse(input.matches(numberMonthRegex));
    }

    @Test
    public void getThree_Digit_Number_Input_Incorrect_Number(){
        String threeDigitNumberRegex = CommonConstants.THREE_DIGIT_NUMBER_REGEX;
        String input = "14";
        assertFalse(input.matches(threeDigitNumberRegex));
    }

    @Test
    public void getThree_Digit_Number_Input_Correct_Number(){
        String threeDigitNumberRegex = CommonConstants.THREE_DIGIT_NUMBER_REGEX;
        String input = "124";
        assertTrue(input.matches(threeDigitNumberRegex));
    }

    @Test
    public void getSecond_Input_Correct_Number(){
        String second = CommonConstants.SECOND_REGEX;
        String input = "124";
        assertTrue(input.matches(second));
    }

    @Test
    public void getSecond_Input_Incorrect_Number(){
        String second = CommonConstants.SECOND_REGEX;
        String input = "-3";
        assertFalse(input.matches(second));
    }
}