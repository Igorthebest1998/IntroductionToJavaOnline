package com.epam.javaIntro.sortArray;

/*
 * 1.Заданы два одномерных массива с различным количеством элементов и натуральное число k.
 *   Объединить их в один  массив,  включив  второй  массив  между k-м  и  (k+1) -м  элементами
 *   первого,  при  этом  не  используя дополнительный массив.
 */

public class Task1 {

    public static void main(String[] args){

        int[] firstArray = new int[]{
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        };
        int[] secondArray = new int[]{
                2, -4, 0, 5, 2, 6, 8, 13, -10, 9
        };
        int[] resultArray = new int[firstArray.length + secondArray.length];
        int k = 4;
        for (int i = 0; i < resultArray.length; i++){
            if (i <= k){
                resultArray[i] = firstArray[i];
            }
            else if (i > k && i <= k + secondArray.length){
                resultArray[i] = secondArray[i - k - 1];
            }
            else{
                resultArray[i] = firstArray[i - firstArray.length];
            }
        }
        for (int i : resultArray){
            System.out.print(i + " ");
        }
    }
}
