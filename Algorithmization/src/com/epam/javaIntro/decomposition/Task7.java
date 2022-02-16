package com.epam.javaIntro.decomposition;

/*
 * 7.�������� �����(������) ��� ���������� ����� ����������� ���� �������� ����� �� 1 �� 9. 
 */

public class Task7 {

    public static void main(String[] args){

        System.out.print("Sum: " + sum());
    }

    public static int sum(){

        int sum = 0;
        for (int i = 1; i <= 9; i = i + 2){
            sum += factorial(i);
        }
        return sum;
    }

    public static int factorial(int a){

        int current = 1;
        for ( int i = 1; i <= a; i++){
            current *= i;
        }
        return current;
    }
}
