package com.epam.javaIntro.cyclingAlgorithm;

import java.util.Scanner;

/*
 * 7.��� ������� ������������ ����� � ���������� �� m �� n ������� ��� ��������,
 *   ����� ������� � ������ �����. m � n �������� � ����������.
 */

public class Task7 {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.println("Input m: ");
        double m = (int)in.nextDouble() + 1;
        System.out.println("Input n: ");
        double n = in.nextDouble();
        for (; m <= n; m++){
            System.out.println("Divisors " + m + ":");
            for (int i = 2; i < m; i++){
                if (m % i == 0)
                    System.out.println(i);
            }
        }
    }
}
