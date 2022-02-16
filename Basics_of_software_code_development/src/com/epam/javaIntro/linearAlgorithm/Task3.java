package com.epam.javaIntro.linearAlgorithm;

import java.util.Scanner;

/*
 * 3.Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 *  (sinx + cosy) / (cosx - siny) * tg xy
 */

public class Task3 {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.println("Input x: ");
        double x = in.nextDouble();
        System.out.println("Input y: ");
        double y = in.nextDouble();
        double result = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        System.out.printf("Result: %.2f", result);
        in.close();
    }
}
