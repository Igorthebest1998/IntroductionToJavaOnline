package com.epam.javaIntro.branchingAlgorithm;

import java.util.Scanner;

/*
 * 1.Даны два угла треугольника (в градусах). Определить, существует
 *   ли такой треугольник, и если да, то будет ли он прямоугольным.
 */

public class Task1 {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.println("Input the first angel: ");
        double angel1 = in.nextDouble();
        System.out.println("Input the second angel: ");
        double angel2 = in.nextDouble();
        double angel3 = 180 - angel1 - angel2;
        if (angel3 > 0) {
            if (angel1 == 90 || angel2 == 90 || angel3 == 90)
                System.out.println("Triangle is rectangular");
            else
                System.out.println("Triangle isn't rectangular");
        }
        else
            System.out.println("Triangle isn't exist");
    }
}
