package com.epam.javaIntro.linearAlgorithm;

/*
 * 5.����  �����������  ����� �, �������  ������������  ������������  ����������  �������  �  ��������.
 *   ������� ������ �������� ������������ � �����, ������� � �������� � ��������� �����:��� ����� SSc.
 */

public class Task5 {

    public static void main(String[] args) {
	// write your code here
        int T = 456378;
        int hours = T / 3600;
        int minutes = (T % 3600) / 60;
        int seconds = T % 60;
        System.out.printf("%d � %d ��� %d �", hours, minutes, seconds);
    }
}
