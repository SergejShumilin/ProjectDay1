package by.javatr.task9.util;

import by.javatr.scanner.EnterFromConsole;

public class Circle {
    private static double circumference;
    private static double squareCicle;

    public static double getCircumference(){
        double radius = EnterFromConsole.enterDouble();
        circumference = 2*Math.PI*radius;
        System.out.println("Длина окружности = " + circumference);
        return circumference;
    }

    public static double getSquareCicle(){
        double radius = EnterFromConsole.enterDouble();
        squareCicle = Math.PI*radius*radius;
        System.out.println("Площать круга равна = " + squareCicle);
        return squareCicle;
    }
}
