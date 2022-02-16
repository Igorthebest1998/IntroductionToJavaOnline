package com.epam.javaIntro.decomposition;

/*
 * 8.Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6]. 
 *	 Пояснение. Составить метод(методы)  для вычисления суммы трех последовательно расположенных элементов 
 *	 массива с номерами от k до m. 
 */

public class Task8 {

    public static void main(String[] args){

        int[] array = new int[]{
                -3, 8, 0, 11, 5, -6, 12, 3, 6, -1
        };

        System.out.println("D[1] + D[2] + D[3]: " + sumThree(array, 1));
        System.out.println("D[3] + D[4] + D[5]: " + sumThree(array, 3));
        System.out.println("D[4] + D[5] + D[6]: " + sumThree(array, 4));
    }

    public static int sumThree(int[] array, int index){

        int sum = 0;
        for (int i = index; i < index + 3; i++){
            sum += array[i];
        }
        return sum;
    }
}
