package com.epam.javaIntro.arrayOfArray;

/*
 * 13.Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
 */

public class Task13 {

    public static void main(String[] args) {

        int[][] matrix = new int[][]{
                {2, 3, 5, 1, 8, 0},
                {5, 7, 0, 6, 2, 3},
                {5, 7, 1, 6, 2, 4},
                {2, 5, 3, 7, 8, 9}
        };
        for (int i = 0; i < matrix[0].length; i++){
            for (int j = 0; j < matrix.length; j++){
                for (int k = 0; k < matrix.length - j - 1; k++){
                    if (matrix[k][i] > matrix[k + 1][i]){
                        int currentElement = matrix[k][i];
                        matrix[k][i] = matrix[k + 1][i];
                        matrix[k + 1][i] = currentElement;
                    }
                }
            }
        }
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matrix had been sorted by ascending");
        for (int i = 0; i < matrix[0].length; i++){
            for (int j = 0; j < matrix.length; j++){
                for (int k = 0; k < matrix.length - j - 1; k++){
                    if (matrix[k][i] < matrix[k + 1][i]){
                        int currentElement = matrix[k][i];
                        matrix[k][i] = matrix[k + 1][i];
                        matrix[k + 1][i] = currentElement;
                    }
                }
            }
        }
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matrix had been sorted by descending");
    }
}
