package com.epam.javaIntro.sortArray;

/*
 * 3.���������� �������. ���� ������������������ ����� a1<=a2<=a3<=...<=an.
 *   ��������� ����������� �������� ���, ����� ��� ���� ����������� �� ��������.
 *   ��� ����� � �������, ������� � �������, ���������� ���������� ������� �
 *   �������� �� ������ �����, � ������ - �� ����� �����������.
 *   �����, ������� �� �������, ��� ��������� �����������.
 *   �������� �������� ���������� �������.
 */

public class Task3 {

    public static void main(String[] args){

        int[] array = new int[]{
                -3, 8, 0, 11, 5, -6, 12, 3, 6, -1
        };
        for (int i = 0; i < array.length - 1; i++){
            int max = array[i];
            int positionMax = i;
            for (int j = i; j < array.length; j++){
                if (array[j] > max){
                    max = array[j];
                    positionMax = j;
                }
            }
            array[positionMax] = array[i];
            array[i] = max;
        }
        for (int i : array){
            System.out.print(i + " ");
        }
    }
}
