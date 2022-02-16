package com.epam.javaIntro.decomposition;

/*
 * 3.Вычислить  площадь  правильного  шестиугольника  со  стороной  а,
 *   используя  метод  вычисления  площади треугольника. 
 */

public class Task3 {

    public static void main(String[] args){

        double sideHexagon = 3;
        double squareHexagon = 6 * squareTriangle(sideHexagon);
        System.out.printf("%.2f", squareHexagon);
    }

    public static double squareTriangle(double side){

        return side * side * Math.sqrt(3) / 4;
    }
}
