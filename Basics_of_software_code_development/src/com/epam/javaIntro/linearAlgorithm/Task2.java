package com.epam.javaIntro.linearAlgorithm;

import java.util.Scanner;

/*
 * 2.Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 *   ((𝑏 + √(𝑏2 + 4𝑎𝑐)) / 2𝑎) − 𝑎3𝑐 + 𝑏^(−2)
 */

public class Task2 {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.println("Input a: ");
        double a = in.nextDouble();
        System.out.println("Input b: ");
        double b = in.nextDouble();
        System.out.println("Input c: ");
        double c = in.nextDouble();
        double result = (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println("Result: " + result);
        in.close();
    }
}
