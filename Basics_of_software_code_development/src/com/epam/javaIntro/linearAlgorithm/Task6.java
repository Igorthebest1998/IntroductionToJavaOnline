package com.epam.javaIntro.linearAlgorithm;

import java.util.Scanner;

/*
 * 6.��� ������ ������� ��������� �������� ���������, ������� �������� true,
 *   ���� ����� � ������������ (�, �) ����������� ����������� �������, � false�� ��������� ������: 
 */

public class Task6 {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.println("Input x: ");
        double x = in.nextDouble();
        System.out.println("Input y: ");
        double y = in.nextDouble();
        System.out.println((y >= 0 && y <= 4 && x >= -2 && x <= 2) || (x >= -4 && x <= 4 && y <= 0 && y >= -3));
        in.close();
    }
}
