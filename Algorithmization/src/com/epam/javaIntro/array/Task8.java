package com.epam.javaIntro.array;

/*
 * 8.����  ������������������  �����  ����� a1, a2, ..., an.  ����������  �����  ������������������,
 *   �������� �� �������� �� �����, ������� ����� min(a1, a2, ..., an).
 */

public class Task8 {

    public static void main(String[] args){

        int[] a = new int[]{
                2, -1, 0, 5, 2, 6, 8, 13, -1, 9
        };
        int countMin = 0;
        int min = a[0];
        for (int i : a){
            if (i < min){
                min = i;
                countMin = 1;
            }
            else if (i == min)
                countMin++;
        }
        int[] b = new int[a.length - countMin];
        int j = 0;
        for (int i : a)
            if (i != min){
                b[j] = i;
                System.out.println(b[j]);
                j++;
            }
    }
}
