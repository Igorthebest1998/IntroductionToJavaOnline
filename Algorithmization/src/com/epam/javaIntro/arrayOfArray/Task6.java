package com.epam.javaIntro.arrayOfArray;

/*
 * 6.—формировать квадратную матрицу пор€дка n по заданному образцу(n-четное):
 *      1   1   1  ... 1   1   1
 *      0   1   1  ... 1   1   0
 *      0   0   1  ... 1   0   0
 *      .   .   .  ... .   .   .
 *      0   1   1  ... 1   1   0
 *      1   1   1  ... 1   1   1
 */

public class Task6 {

    public static void main(String[] args){

        int n = 8;
        int[][] matrix = new int[n][n];
        int k = 0;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if (j < k || j > (n - k - 1))
                    matrix[i][j] = 0;
                else
                    matrix[i][j] = 1;
            }
            if (i < (matrix.length / 2 - 1)){
                k++;
            }
            else if (i > (matrix.length / 2 - 1))
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
