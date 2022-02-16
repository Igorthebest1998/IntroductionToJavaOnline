package com.epam.javaIntro.arrayOfArray;

/*
 * 2.Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */

public class Task2 {

    public static void main(String[] args){

        int[][] matrix = new int[][]{
                { 2, 3, 5, 1 },
                { 5, 7, 1, 6 },
                { 5, 7, 1, 6 },
                { 2, 5, 3, 7 }
        };
        for (int i = 0; i < matrix.length; i++){
            System.out.print(matrix[i][i] + " ");
        }
    }
}
