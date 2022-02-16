package com.epam.javaIntro.cyclingAlgorithm;

/*
 * 3.Найти сумму квадратов первых ста чисел.
 */

public class Task3 {

    public static void main(String[] args) {
	// write your code here
        int sum = 0;
        for (int i = 0; i <= 100; i++)
            sum += i * i;
        System.out.println("Sum: " + sum);
    }
}
