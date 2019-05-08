package by.javatr.shumilin.task1.util;

public class SquareOfNumber {

    public static int getLastDigitOfSquareNumber(int enteredNumber) {
        int lastDigitOfNumber = enteredNumber % 10;
        int squareLastDigitOfNumber = lastDigitOfNumber * lastDigitOfNumber;

        return squareLastDigitOfNumber % 10;
    }
}
