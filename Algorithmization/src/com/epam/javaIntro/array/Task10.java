package com.epam.javaIntro.array;

/*
 * 10.��� ������������� ������ � ����������� ��������� �. ����� ������,
 *    �������� �� ���� ������ ������ ������� (�������������� �������� ��������� ������).
 *    ����������. �������������� ������ �� ������������.
 */

public class Task10 {

    public static void main(String[] args){

        int[] a = new int[]{
                2, -1, 0, 5, 2, 6, 8, 13, -1, 9
        };
        for (int i = 1; i < a.length / 2; i++){
            a[i] = a[2 * i];
        }
        for (int i = a.length / 2; i < a.length; i++){
            a[i] = 0;
        }
        for (int i : a)
            System.out.println(i);
    }
}
