package com.epam.javaIntro.cyclingAlgorithm;

import java.util.Scanner;

/*
 * 8.���� ��� �����. ���������� �����, �������� � ������ ��� ������� ��� � ������� �����.
 */

public class Task8 {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int firstNumber = in.nextInt();
        System.out.println("Input the second number: ");
        int secondNumber = in.nextInt();
        while (firstNumber > 0){
            int number = secondNumber;
            int degreeFirstNumber = firstNumber % 10;
            while (number > 0){
                int degreeSecondNumber = number % 10;
                if (degreeFirstNumber == degreeSecondNumber)
                    System.out.println(degreeFirstNumber);
                number = number / 10;
            }
            firstNumber = firstNumber / 10;
        }
    }
}
