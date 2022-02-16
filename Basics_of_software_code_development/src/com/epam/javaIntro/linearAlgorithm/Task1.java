package com.epam.javaIntro.linearAlgorithm;

import java.util.Scanner;

/*
 * 1.Найдите значение функции: z = ( (a–3 ) * b/ 2) + c.
 */

public class Task1 {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.println("Input a:");
        double a = in.nextDouble();
        System.out.println("Input b:");
        double b = in.nextDouble();
        System.out.println("Input c:");
        double c = in.nextDouble();
        double z = ((a - 3) * b / 2) + c;
        System.out.println("z = " + z);
        in.close();
    }
}
