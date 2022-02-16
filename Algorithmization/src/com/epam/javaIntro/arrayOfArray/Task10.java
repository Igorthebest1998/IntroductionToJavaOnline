package com.epam.javaIntro.arrayOfArray;

/*
 * 10.Ќайти положительные элементы главной диагонали квадратной матрицы.
 */

public class Task10 {

    public static void main(String[] args){

        int[][] matrix = new int[][]{
                { 2, 3, 5, 1 },
                { 5, -7, 1, 6 },
                { 5, 7, 1, 6 },
                { 2, 5, 3, 7 }
        };
        for (int i = 0; i < matrix.length; i++){
            if (matrix[i][i] > 0){
                System.out.println(matrix[i][i]);
            }
        }
    }
}
