package com.epam.javaIntro.branchingAlgorithm;

import java.util.Scanner;

/*
 * 2.Найти max{min(a, b), min(c, d)}.
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
        System.out.println("Input d: ");
        double d = in.nextDouble();
        double min1, min2, max;
        if (a > b)
            min1 = b;
        else
            min1 = a;
        if (c > d)
            min2 = d;
        else
            min2 = c;
        if (min1 > min2)
            max = min1;
        else
            max = min2;
        System.out.println("Max{min(a,b), min(c,d)}: " + max);
    }
}
