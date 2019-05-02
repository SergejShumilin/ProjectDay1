package by.javatr.task3.util;

import by.javatr.scanner.MyScanner;

public class Area {

    public static double getAreaOfSquareInsideCicle() throws Exception {
        double areaOfSquareOutsideCicle = MyScanner.enterDouble();
        if (areaOfSquareOutsideCicle<1){
            throw new Exception();
        } else {
            double radiusCicle = Math.sqrt(areaOfSquareOutsideCicle) / 2; /*радиус вписанной окружности равен половине стороны квадрата*/
            double diagonalSquareInsideCicle = radiusCicle * 2; /*Радиус описанной окружности – это половина диагонали квадрата*/
            double areaOfSquareInsideCicle = diagonalSquareInsideCicle * diagonalSquareInsideCicle / 2;/*Площадь квадрата равна половине квадрата длины его диагонали.*/
            System.out.println("Площадь вписанного квадрата равна " + areaOfSquareInsideCicle);
            double differentAreasOfSquares = areaOfSquareOutsideCicle / areaOfSquareInsideCicle;
            System.out.println("Площадь вписанного квадрата меньше площади заданного в " + differentAreasOfSquares + " раза");
            return areaOfSquareInsideCicle;
        }
    }
}
