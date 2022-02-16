package com.epam.javaIntro.branchingAlgorithm;

import java.util.Scanner;

/*
 * 4.Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
 *   Определить, пройдет ли кирпич через отверстие.
 */

public class Task4 {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.println("Input A: ");
        double a = in.nextDouble();
        System.out.println("Input B:");
        double b = in.nextDouble();
        System.out.println("Input x:");
        double x = in.nextDouble();
        System.out.println("Input y:");
        double y = in.nextDouble();
        System.out.println("Input z:");
        double z = in.nextDouble();
        boolean condition1 = (a > x && b > y) || (b > x && a > y);
        boolean condition2 = (a > y && b > z) || (b > y && a > z);
        boolean condition3 = (a > z && b > x) || (b > z && a > x);
        if (condition1 || condition2 || condition3)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
