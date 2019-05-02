package by.javatr.task9.util;

import by.javatr.scanner.MyScanner;

public class Circle {

    public static double getCircumferenceAndSquareCicle() throws Exception {
        double radius = MyScanner.enterDouble();
        if (radius<1){
            throw new Exception();
        } else {
            double circumference = 2 * Math.PI * radius;
            double squareCicle = Math.PI*radius*radius;
            System.out.println("Длина окружности = " + circumference + ", площадь круга = " + squareCicle);
            return circumference;
        }
    }
}
