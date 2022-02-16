package com.epam.javaIntro.decomposition;

/*
 * 6.Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 */

public class Task6 {

    public static void main(String[] args){

        int a = 4;
        int b = 8;
        int c = 12;
        System.out.println(isPrimitive(a, b, c));
    }

    public static boolean isPrimitive(int a, int b, int c){

        return (nod(nod(a, b), c) == 1);
    }

    public static int nod(int a, int b) {

        if (a % b == 0) return b;
        if (b % a == 0) return a;
        if (a > b) return nod(a % b, b);
        else return nod(b % a, a);
    }
}
