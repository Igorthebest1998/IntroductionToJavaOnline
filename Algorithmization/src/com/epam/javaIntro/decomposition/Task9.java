package com.epam.javaIntro.decomposition;

/*
 * 9.Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади, 
 *	 если угол между сторонами длиной X и Y— прямой. 
 */

public class Task9 {

    public static void main(String[] args){

        double x = 3;
        double y = 4;
        double z = 5;
        double t = 5;
        double diagonal = hypotenuse(x, y);
        double square = squareTriangle(x, y, diagonal) + squareTriangle(z, t, diagonal);
        System.out.printf("Square quadrangle: %.2f", square);
    }

    public static double hypotenuse(double a, double b){

        return Math.sqrt(a * a + b * b);
    }

    public static double halfPerimeter(double a, double b, double c){

        return (a + b + c) / 2;
    }

    public static double squareTriangle(double a, double b, double c){

        double p = halfPerimeter(a, b, c);
        double square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return square;
    }
}
