package com.epam.javaIntro.arrayOfArray;

import java.util.Scanner;

/*
 * 3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */

public class Task3 {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int[][] matrix = new int[][]{
                { 2, 3, 5, 1, 8, 0},
                { 5, 7, 0, 6, 2, 3},
                { 5, 7, 1, 6, 2, 4},
                { 2, 5, 3, 7, 8, 9}
        };
        System.out.println("Input k: ");
        int k = in.nextInt();
        System.out.println("Input p: ");
        int p = in.nextInt();
        for (int i = 0; i < matrix[k].length; i++){
            System.out.print(matrix[k][i] + " ");
        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++){
            System.out.print(matrix[i][p] + " ");
        }
    }
}
