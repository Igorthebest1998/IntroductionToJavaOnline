package com.epam.javaIntro.arrayOfArray;

/*
 * 15.Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 */

public class Task15 {

    public static void main(String[] args){

        int[][] matrix = new int[][]{
                {2, 3, 5, 1, 8, 0},
                {5, 7, 0, 6, 2, 3},
                {5, 7, 1, 6, 2, 4},
                {2, 5, 3, 7, 8, 4}
        };
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if (max < matrix[i][j]){
                    max = matrix[i][j];
                }
            }
        }
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j] % 2 != 0){
                    matrix[i][j] = max;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
