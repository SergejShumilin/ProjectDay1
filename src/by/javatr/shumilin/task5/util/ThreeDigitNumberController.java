package by.javatr.shumilin.task5.util;

public class ThreeDigitNumberController {

    public static boolean isSquareNumberEqualsCubeOfSumNumbers(long number) {
            long squareNumb = (long) Math.pow(number, 2);
            long sum = number / 100 + number % 100 / 10 + number % 10;
            long cubeSum = (long) Math.pow(sum, 3);
            return squareNumb == cubeSum;
    }
}
