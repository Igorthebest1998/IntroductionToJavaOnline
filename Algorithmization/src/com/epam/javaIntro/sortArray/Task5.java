package com.epam.javaIntro.sortArray;

/*
 * 5. ���������� ���������. ���� ������������������ ����� �1, �1, ..., an. ��������� �����������
 * ����� � ������� �����������. �������� ��� ��������� �������. ����� a1, a2, ..., ai - �������������
 * ������������������, �.�. a1<=a2<=...<=ai. ������� ��������� ����� ai+1 � ����������� �
 * ������������������ ���, ����� ����� ������������������ ���� ���� ������������. �������
 * ������������ �� ��� ���, ���� ��� �������� �� ����� ���������. ����������. ����� ���������
 * ���������� �������� � ��������������� ����� ����������� � ������� ��������� ������.
 * �������� ����� �������� � ���� ��������� �������.
 */

public class Task5 {

    public static void main(String[] args){

        int[] array = new int[]{
                -3, 8, 0, 11, 5, -6, 12, 3, 6, -1, 6
        };
        for (int i = 1; i < array.length; i++){
            int positionInsert = binarySearch(array, i, array[i]);
            int currentElement = array[i];
            for (int j = i; j > positionInsert; j--){
                array[j] = array[j - 1];
            }
            array[positionInsert] = currentElement;
        }
        for (int i : array){
            System.out.print(i + " ");
        }
    }

    public static int binarySearch(int[] array, int length, int key){
        int l = -1;
        int r = length;
        while (l < r - 1){
            int m = (l + r) / 2;
            if (array[m] < key){
                l = m;
            }
            else {
                r = m;
            }
        }
        return r;
    }
}
