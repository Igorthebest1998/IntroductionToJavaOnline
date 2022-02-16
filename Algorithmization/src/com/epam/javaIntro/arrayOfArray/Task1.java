package com.epam.javaIntro.arrayOfArray;

/*
 * 1.Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 */

public class Task1 {

    public static void main(String[] args){

        int[][] matrix = new int[][]{
                { 2, 3, 5, 1, 8, 0},
                { 5, 7, 1, 6, 2, 4},
                { 5, 7, 1, 6, 2, 4},
                { 1, 5, 3, 7, 8, 9}
        };
        for (int i = 0; i < matrix.length; i += 2){
            if (matrix[0][i] > matrix[matrix.length - 1][i]){
                for (int j = 0; j < matrix.length; j++)
                    System.out.print(matrix[j][i] + " ");
                System.out.println();
            }
        }
    }
}
