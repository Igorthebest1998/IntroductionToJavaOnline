package com.epam.javaIntro.arrayOfArray;

/*
 * 14.—формировать случайную матрицу mxn, состо€щую из нулей и единиц,
 *    причем в каждом столбце число единиц равно номеру столбца.
 */

public class Task14 {

    public static void main(String[] args){

        int m = 5;
        int n = 6;
        int[][] matrix = new int[m][n];
        for (int i = 0; i < n; i++){
            int countOne = 0;
            for (int j = 0; j < m; j++){
                if (countOne == i){
                    matrix[j][i] = 0;
                }
                else if ((m - j) == (i - countOne)){
                    matrix[j][i] = 1;
                    countOne++;
                }
                else{
                    matrix[j][i] = (int)(Math.random() * 2);
                    if (matrix[j][i] == 1){
                        countOne++;
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
    }
}
