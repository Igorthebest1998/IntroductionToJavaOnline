package com.epam.javaIntro.array;

/*
 * 6.«адана последовательность N вещественных чисел.
 *   ¬ычислить сумму чисел, пор€дковые номера которых €вл€ютс€ простыми числами.
 */

public class Task6 {

    public static void main(String[] args){

        double[] a = new double[]{
                2.4, 3.1, -2.5, 0, 3.1, -1.5, 0, -0.2, 5.6, 2, 7.4, -12
        };
        double sum = 0;
        for (int i = 0; i < a.length; i++){
            boolean isPrimitive = true;
            for (int j = 2; j < i; j++)
                if (i % j == 0)
                    isPrimitive = false;
            if (isPrimitive)
                sum += a[i];
        }
        System.out.println("Sum: " + sum);
    }
}
