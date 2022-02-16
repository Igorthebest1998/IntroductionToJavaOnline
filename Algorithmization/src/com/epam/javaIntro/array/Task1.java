package com.epam.javaIntro.array;

import java.util.Scanner;

/*
 * 1.В массив A[N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 */

public class Task1 {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int[] a = new int[]{
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        };
        System.out.println("Input k: ");
        int k = in.nextInt();
        int sum = 0;
        for (int i : a){
            if (i % k == 0)
               sum += i;
        }
        System.out.println("Result: " + sum);
    }
}
