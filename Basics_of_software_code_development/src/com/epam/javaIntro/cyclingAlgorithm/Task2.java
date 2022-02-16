package com.epam.javaIntro.cyclingAlgorithm;

import java.util.Scanner;

/*
 * 2.Вычислить значения функции на отрезке [а,b] c шагом h:
 *   y =   x, x > 2
 *        -x, x <=2
 */

public class Task2 {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.println("Input a: ");
        double a = in.nextDouble();
        System.out.println("Input b: ");
        double b = in.nextDouble();
        System.out.println("Input h: ");
        double h = in.nextDouble();
        while (a <= b){
            if (a > 2)
                System.out.printf("x= %.2f y= %.2f", a, a);
            else
                System.out.printf("x= %.2f y= %.2f", a, -a);
            System.out.println();
            a += h;
        }
    }
}
