package com.epam.javaIntro.array;

/*
 * 4.Даны действительные числа а1,а2,..., аn. Поменять местами наибольший и наименьший элементы.
 */

public class Task4 {

    public static void main(String[] args){

        double[] a = new double[]{
                2.4, 3.1, -2.5, 0, 3.1, -1.5, 0, -0.2, 5.6
        };
        double max = a[0];
        int positionMax = 0;
        double min = a[0];
        int positionMin = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] > max){
                max = a[i];
                positionMax = i;
            }
            if (a[i] < min){
                min = a[i];
                positionMin = i;
            }
        }
        a[positionMax] = min;
        a[positionMin] = max;
        for (double i : a)
            System.out.println(i);
    }
}
