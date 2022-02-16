package com.epam.javaIntro.arrayOfArray;

/*
 * 5.—формировать квадратную матрицу пор€дка n по заданному образцу(n-четное):
 *      1   1   1  ... 1   1   1
 *      2   2   2  ... 2   2   0
 *      3   3   3  ... 3   0   0
 *      .   .   .  ... .   .   .
 *     n-1 n-1  0  ... 0   0   0
 *      n   0   0  ... 0   0   0
 */

public class Task5 {

    public static void main(String[] args){

        int n = 4;
        int[][] matrix = new int[n][n];
        int k = n;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if (j < k)
                    matrix[i][j] = i + 1;
                else
                    matrix[i][j] = 0;
            }
            k--;
        }
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
