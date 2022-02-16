package com.epam.javaIntro.array;

import java.util.Scanner;

/*
 * 2.Дана последовательность действительных чисел а1,а2 ,..., аn.
 *   Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.
 */

public class Task2 {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        double[] a = new double[]{
                1.5, 2.8, 3.6, 2.4, 1.1, 0.3, 1.8, 2.3
        };
        System.out.println("Input z: ");
        double z = in.nextDouble();
        int count = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] > z){
                a[i] = z;
                count++;
            }
            System.out.println(a[i]);
        }
        System.out.println("Count: " + count);
    }
}
