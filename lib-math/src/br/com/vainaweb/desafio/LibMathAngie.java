package br.com.vainaweb.desafio;

import java.lang.Math;
public class LibMathAngie {
    public static double add(double... numbers) {
        double result = 0;
        for (double number : numbers) {
            result += number;
        }
        return result;
    }

    public static double subtract(double... numbers) {
        if (numbers.length < 2) {
            throw new IllegalArgumentException("Adicione ao menos dois números.");
        }

        double result = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }

        return result;
    }

    public static double multiply(double... numbers) {
        double result = 1;
        for (double number : numbers) {
            result *= number;
        }
        return result;
    }

    public static double divide(double... numbers) {
        if (numbers.length < 2) {
            throw new IllegalArgumentException("Adicione ao menos dois números.");
        }

        double result = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                throw new IllegalArgumentException("Não pode dividir por zero.");
            }
            result /= numbers[i];
        }

        return result;
    }

    public static double calcAreaRectangle(double length, double width) {
        return length * width;
    }

    public static double calcPerimeterRectangle(double length, double width) {
        return 2 * (length + width);
    }

    public static double calcVolumeRectangle(double length, double width, double height) {
        return length * width * height;
    }

    public static double calcAreaBox(double side) {
        return side * side;
    }

    public static double calcPerimeterBox(double side) {
        return 4 * side;
    }

    public static double calcVolumeCube(double side) {
        return Math.pow(side, 3);
    }

    public static double calcAreaCircle(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double calcPerimeterCircle(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double calcVolumeCylinder(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double calcSimpleInterest(double principal, double rate, double time) {
        return principal * rate * time;
    }

    public static double calcCompoundInterest(double principal, double rate, double time) {
        return principal * Math.pow((1 + rate), time) - principal;
    }
}