package com.epam.javaIntro.cyclingAlgorithm;

import java.util.Scanner;

/*
 * 1.Напишите программу, где пользователь вводит любое целое положительное число.
 *   А программа суммирует все числа от 1 до введенного пользователем числа.
 */

public class Task1 {

    public static void main(String[] args) {
	// write your code here
        Scanner in  = new Scanner(System.in);
        System.out.println("Input x: ");
        int x = in.nextInt();
        int sum = 0;
        for (int i = 0; i <= x; i++)
            sum += i;
        System.out.println("Sum: " + sum);
    }
}
