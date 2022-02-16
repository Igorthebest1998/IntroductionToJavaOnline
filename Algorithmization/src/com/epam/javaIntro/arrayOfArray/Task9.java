package com.epam.javaIntro.arrayOfArray;

/*
 * 9.Задана матрица неотрицательных чисел.
 *   Посчитать сумму элементов в каждом столбце.
 *   Определить, какой столбец содержит максимальную сумму.
 */

public class Task9 {

    public static void main(String[] args){

        int[][] matrix = new int[][]{
                { 2, 3, 5, 1, 8, 0},
                { 5, 7, 0, 6, 2, 3},
                { 5, 7, 1, 6, 2, 4},
                { 2, 5, 3, 7, 8, 9}
        };
        int max = 0;
        int columnMax = 0;
        for (int i = 0; i < matrix[0].length; i++){
            int currentSum = 0;
            for (int j = 0; j < matrix.length; j++){
                currentSum += matrix[j][i];
            }
            if (max < currentSum){
                max = currentSum;
                columnMax = i;
            }
        }
        System.out.println("Column with max sum is " + columnMax + ", sum = " + max);
    }
}
