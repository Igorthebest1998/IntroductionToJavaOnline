package com.epam.javaIntro.decomposition;

/*
 * 2.Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */

public class Task2 {

    public static void main(String[] args){

        int a = 24;
        int b = 30;
        int c = 12;
        int d = 18;
        System.out.println("NOD: " + nod(a, b, c, d));
    }

    public static int nod(int a, int b, int c, int d){

        return nod(nod(a, b), nod(c, d));
    }

    public static int nod(int a, int b) {

        if (a % b == 0) return b;
        if (b % a == 0) return a;
        if (a > b) return nod(a % b, b);
        else return nod(b % a, a);
    }
}
