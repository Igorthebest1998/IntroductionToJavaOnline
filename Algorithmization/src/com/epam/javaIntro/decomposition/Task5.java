package com.epam.javaIntro.decomposition;

/*
 * 5.Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число, 
 *	 которое меньше максимального элемента массива, но больше всех других элементов). 
 */

public class Task5 {

    public static void main(String[] args){

        int[] array = new int[]{
                -3, 8, 0, 11, 5, -6, 12, 3, 6, -1
        };
        int max = max(array);
        int preMax = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] > preMax && array[i] < max){
                preMax = array[i];
            }
        }
        System.out.println("Premax: " + preMax);
    }

    public static int max(int[] array){

        int max = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] > max) max = array[i];
        }
        return max;
    }
}
