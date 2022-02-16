package com.epam.javaIntro.decomposition;

/*
 * 1.Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух 
 *	 натуральных чисел:
 *	 НОК(А,Б) = А * Б / НОД(А,Б)
 */

public class Task1 {

    public static void main(String[] args){

        int a = 30;
        int b = 20;
        System.out.println("NOD: " + nod(a, b));
        System.out.println("NOK: " + nok(a, b));
    }

    public static int nok(int a, int b){

        return (a * b) / nod(a, b);
    }

    public static int nod(int a, int b) {

        if (a % b == 0) return b;
        if (b % a == 0) return a;
        if (a > b) return nod(a % b, b);
        else return nod(b % a, a);
    }
}
