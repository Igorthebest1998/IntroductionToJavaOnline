package com.epam.javaIntro.cyclingAlgorithm;

import java.util.Scanner;

/*
 * 5.Даны  числовой  ряд  и  некоторое  число  е.  Найти  сумму  тех  членов ряда,
 *   модуль  которых  больше  или  равен заданному е. Общий член ряда имеет вид:
 *   a(n) = 1/2^n + 1/3^n
 */

public class Task5 {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner (System.in);
        System.out.println("Input e: ");
        double e = in.nextDouble();
        int n = 1;
        double sum = 0;
        while (true){
            double currentElement = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
            if (Math.abs(currentElement) <= e)
                break;
            sum += currentElement;
            n++;
        }
        System.out.printf("Result: %.2f", sum);
    }
}
