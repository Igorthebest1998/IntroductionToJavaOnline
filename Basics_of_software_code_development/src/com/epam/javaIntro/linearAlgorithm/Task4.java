package com.epam.javaIntro.linearAlgorithm;

/*
 * 4.���� �������������� ����� R ���� nnn.ddd(��� �������� ������� � ������� � ����� ������).
 *   �������� ������� ������� � ����� ����� ����� � ������� ���������� �������� �����.
 */

public class Task4 {

    public static void main(String[] args) {

        double r = 389.136;
        int a = (int)r;
        int b = (int)((r - a) * 1000);
        r = b + a / 1000.0;
        System.out.println(r);
    }

}
