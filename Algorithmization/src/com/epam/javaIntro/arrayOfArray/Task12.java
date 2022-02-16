package com.epam.javaIntro.arrayOfArray;

/*
 * 12.Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
 */

public class Task12 {

    public static void main(String[] args){

        int[][] matrix = new int[][]{
                { 2, 3, 5, 1, 8, 0},
                { 5, 7, 0, 6, 2, 3},
                { 5, 7, 1, 6, 2, 4},
                { 2, 5, 3, 7, 8, 9}
        };
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                for (int k = 0; k < matrix[i].length - j - 1; k++){
                    if (matrix[i][k] > matrix[i][k + 1]){
                        int currentElement = matrix[i][k];
                        matrix[i][k] = matrix[i][k + 1];
                        matrix[i][k + 1] = currentElement;
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
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                for (int k = 0; k < matrix[i].length - j - 1; k++){
                    if (matrix[i][k] < matrix[i][k + 1]){
                        int currentElement = matrix[i][k];
                        matrix[i][k] = matrix[i][k + 1];
                        matrix[i][k + 1] = currentElement;
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
