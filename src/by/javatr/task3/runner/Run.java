package by.javatr.task3.runner;

import by.javatr.task3.util.Area;

public class Run {
    public static void main(String[] args) {
        try {
            Area.getAreaOfSquareInsideCicle();
        } catch (Exception e) {
            System.out.println("Введены не верные данные!");
        }
    }
}
