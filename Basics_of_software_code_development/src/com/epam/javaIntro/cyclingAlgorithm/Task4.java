package com.epam.javaIntro.cyclingAlgorithm;

import java.math.BigInteger;

/*
 * 4.Составить программу нахождения произведения квадратов первых двухсот чисел.
 */

public class Task4 {

    public static void main(String[] args) {
	// write your code here
        BigInteger result = BigInteger.valueOf(1);
        for (int i = 1; i <= 200; i++)
            result = result.multiply(BigInteger.valueOf(i * i));
        System.out.println("Result: " + result);
    }
}
