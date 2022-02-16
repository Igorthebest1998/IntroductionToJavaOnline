package com.epam.javaIntro.array;

/*
 * 7.Даны действительные числа a1, a2, ..., a(n), ..., a(2n). 
  *  Найти max(a1 + a(2n), a2 + a(2n-1), ..., a(n) + a(n+1)) 
 */

public class Task7 {

    public static void main(String[] args){

        double[] a = new double[]{
                2.4, 3.1, -2.5, 0, 3.1, -1.5, 0, -0.2, 5.6, 2, 7.4, -12
        };
        double max = a[0] + a[a.length - 1];
        for (int i = 0; i < a.length; i++){
            double current = a[i] + a[a.length - i - 1];
            if (current > max)
                max = current;
        }
        System.out.println("Result: " + max);
    }
}
