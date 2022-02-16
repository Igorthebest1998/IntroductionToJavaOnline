package com.epam.javaIntro.array;

/*
 * 9.В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. 
 *   Если таких чисел несколько, то определить наименьшее из них.
 */

public class Task9 {

    public static void main(String[] args){

        int[] a = new int[]{
                2, -1, 0, 5, 2, 6, 8, 13, -1, 9
        };
        int currentCount = 0;
        int maxCount = 0;
        int frequent = a[0];
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a.length; j++){
                if (a[i] == a[j])
                    currentCount++;
            }
            if (currentCount > maxCount){
                maxCount = currentCount;
                frequent = a[i];
            }
            else if (currentCount == maxCount)
                if (a[i] < frequent)
                    frequent = a[i];
            currentCount = 0;
        }
        System.out.println("Frequent element: " + frequent);
    }
}
