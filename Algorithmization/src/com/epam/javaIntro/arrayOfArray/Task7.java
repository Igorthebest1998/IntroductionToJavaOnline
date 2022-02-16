package com.epam.javaIntro.arrayOfArray;

/*
 * 7.Сформировать квадратную матрицу порядка N по правилу: 
 *   A[I,J] = sin((I^2 - J^2) / N)
 *   и подсчитать количество положительных элементов в ней.
 */

public class Task7 {

    public static void main(String[] args){

        int n = 4;
        double[][] matrix = new double[n][n];
        int countPositiveElements = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Math.sin((i * i - j * j) / n);
                System.out.printf("%.2f ", matrix[i][j]);
                if (matrix[i][j] > 0)
                    countPositiveElements++;
            }
            System.out.println();
        }
        System.out.println("Count positive elements: " + countPositiveElements);
    }
}
