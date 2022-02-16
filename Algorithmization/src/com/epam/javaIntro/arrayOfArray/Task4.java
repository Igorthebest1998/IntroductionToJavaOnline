package com.epam.javaIntro.arrayOfArray;

/*
 *  4.—формировать квадратную матрицу пор€дка n по заданному образцу(n-четное):
 *      1   2   3   ... n
 *      n  n-1 n-2  ... 1
 *      1   2   3   ... n
 *      n  n-1 n-2  ... 1
 *      .   .   .   ... .
 *      n  n-1 n-2  ... 1
 */

public class Task4 {

    public static void main(String[] args){

        int n = 4;
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++)
            if (i % 2 != 0){
                matrix[i][j] = n - j;
            }
            else
                matrix[i][j] = j + 1;
        }
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
