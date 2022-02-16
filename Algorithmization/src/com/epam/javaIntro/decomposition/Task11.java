package com.epam.javaIntro.decomposition;

/*
 * 11.Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 */

public class Task11 {

    public static void main(String[] args){

        int n = 3459876;
        int k = 1254678923;
        if (moreDigit(n, k) == 0){
            System.out.print("Count of digits is equal");
        }
        else
            System.out.print("Count of digits in number: " + moreDigit(n, k));
    }

    public static int moreDigit(int a, int b){

        if (digit(a) > digit(b)) return a;
        else
            if (digit(b) > digit(a)) return b;
            else
                return 0;
    }

    public static int digit(int a){

        int digitNumber = 0;
        while(a > 0){
            digitNumber++;
            a /= 10;
        }
        return digitNumber;
    }
}
