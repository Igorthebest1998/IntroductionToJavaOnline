package com.epam.javaIntro.array;

/*
 * 3.ƒан  массив  действительных  чисел,  размерность  которого N.  ѕодсчитать,
 *   сколько  в  нем  отрицательных, положительных и нулевых элементов.
 */

public class Task3 {

    public static void main(String[] args){

        double[] a = new double[]{
                2.4, 3.1, -2.5, 0, 3.1, -1.5, 0, -0.2, 5.6
        };
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for (double i : a){
            if (i > 0)
                positive++;
            else if (i < 0)
                negative++;
            else zero++;
        }
        System.out.println("Positive elements: " + positive);
        System.out.println("Zero elements: " + zero);
        System.out.println("Negative elements: " + negative);
    }
}
