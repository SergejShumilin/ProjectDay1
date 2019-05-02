package by.javatr.task9.runner;

import by.javatr.task9.util.Circle;

public class Run {
    public static void main(String[] args) {
        try {
            Circle.getCircumferenceAndSquareCicle();
        } catch (Exception e) {
            System.out.println("Введенные данные не верны!");
        }
    }
}
