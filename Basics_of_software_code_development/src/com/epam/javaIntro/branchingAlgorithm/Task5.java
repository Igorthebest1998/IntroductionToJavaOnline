package com.epam.javaIntro.branchingAlgorithm;

import java.util.Scanner;

/*
 * 5.Вычислить значение функции:
 *  x^2 - 3x + 9, если x <= 3;
 *  1 / (x^3 + 6), если x > 3.
 */

public class Task5 {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.println("Input x: ");
        double x = in.nextDouble();
        double f;
        if (x <= 3)
            f = x * x - 3 * x + 9;
        else
            f = 1 / (Math.pow(x, 3) + 6);
        System.out.printf("F(x): %.3f", f);
    }
}
