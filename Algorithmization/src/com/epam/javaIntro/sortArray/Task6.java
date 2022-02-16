package com.epam.javaIntro.sortArray;

/*
 * 6.���������� �����. ���  ������ n ��������������  �����.  ���������  �����������  ���  ��  �����������.
 *   �������� ��� ��������� �������: ������������ ��� �������� �������� ai � a(i+1). ���� ai<=a(i+1), 
 *   �� ������������ �� ���� ������� ������. ���� ai > a(i+1), �� ������������ ������������
 *   � ���������� �� ���� ������� �����. ��������� �������� ���� ����������.
 */

public class Task6 {

    public static void main(String[] args){

        int[] array = new int[]{
                -3, 8, 0, 11, 5, -6, 12, 3, 6, -1, 6
        };
        int i = 0;
        while (i < array.length - 1){
            if (array[i] <= array[i + 1]){
                i++;
            }
            else {
                int currentElement = array[i];
                array[i] = array[i + 1];
                array[i + 1] = currentElement;
                if (i > 0)
                i--;
            }
        }
        for(int j : array){
            System.out.print(j + " ");
        }
    }
}
