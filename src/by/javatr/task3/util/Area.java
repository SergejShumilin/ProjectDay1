package by.javatr.task3.util;

import by.javatr.scanner.EnterFromConsole;

public class Area {
    private static double areaOfSquareInsideCicle;
    private static double differentAreasOfSquares;

    public static double getAreaOfSquareInsideCicle(){
        double areaOfSquareOutsideCicle = EnterFromConsole.enterDouble();
        double radiusCicle = Math.sqrt(areaOfSquareOutsideCicle) / 2; /*радиус вписанной окружности равен половине стороны квадрата*/
        double diagonalSquareInsideCicle = radiusCicle * 2; /*Радиус описанной окружности – это половина диагонали квадрата*/
        areaOfSquareInsideCicle = diagonalSquareInsideCicle * diagonalSquareInsideCicle / 2;/*Площадь квадрата равна половине квадрата длины его диагонали.*/
        System.out.println("Площадь вписанного квадрата равна " + areaOfSquareInsideCicle);
        differentAreasOfSquares = areaOfSquareOutsideCicle / areaOfSquareInsideCicle;
        System.out.println("Площадь вписанного квадрата меньше площади заданного в " + differentAreasOfSquares + " раза");
        return areaOfSquareInsideCicle;
    }
}
