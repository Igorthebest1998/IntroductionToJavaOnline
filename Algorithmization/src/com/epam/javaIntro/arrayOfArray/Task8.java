package com.epam.javaIntro.arrayOfArray;

import java.util.Scanner;

/*
 * 8.В числовой матрице поменять местами два любых столбца,
 *   т. е. все элементы одного столбца поставить на соответствующие им позиции другого,
 *   а элементы второго переместить в первый. Номера столбцов вводит пользователь с клавиатуры.
 */

public class Task8 {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int[][] matrix = new int[][]{
                { 2, 3, 5, 1, 8, 0},
                { 5, 7, 0, 6, 2, 3},
                { 5, 7, 1, 6, 2, 4},
                { 2, 5, 3, 7, 8, 9}
        };
        System.out.println("Input first column: ");
        int firstColumn = in.nextInt();
        System.out.println(("Input second column: "));
        int secondColumn = in.nextInt();
        int[] column = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            column[i] = matrix[i][firstColumn];
            matrix[i][firstColumn] = matrix[i][secondColumn];
            matrix[i][secondColumn] = column[i];
        }
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
