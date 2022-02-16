package com.epam.javaIntro.arrayOfArray;

/*
 * 11.������� 10x20 ��������� ���������� ������� �� 0 �� 15.
 *    ������� �� ����� ���� ������� � ������ �����, � ������� ����� 5 ����������� ��� � ����� ���.
 */

public class Task11 {

    public static void main(String[] args){

        int n = 10;
        int m = 10;
        int countString = 0;
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++){
            int countFive = 0;
            for (int j = 0; j < m; j++){
                matrix[i][j] = (int)(Math.random() * 16);
                if (matrix[i][j] == 5){
                    countFive++;
                }
            }
            if (countFive >= 3){
                countString++;
            }
        }
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Count string with 3 and more fives: " + countString);
    }
}
