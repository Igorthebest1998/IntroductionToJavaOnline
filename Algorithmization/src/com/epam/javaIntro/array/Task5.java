package com.epam.javaIntro.array;

/*
 * 5.���� ����� ����� �1,�2 ,..., �n. ������� �� ������ ������ �� �����, ��� ������� �i > i.
 */

public class Task5 {

    public static void main(String[] args){

        int[] a = new int[]{
                2, -4, 0, 5, 2, 6, 8, 13, -10, 9
        };
        for (int i = 0; i < a.length; i++) {
            if (a[i] > i)
                System.out.print(a[i] + " ");
        }
    }
}
