package com.epam.javaIntro.linearAlgorithm;

/*
 * 4.ƒано действительное число R вида nnn.ddd(три цифровых разр€да в дробной и целой част€х).
 *   ѕомен€ть местами дробную и целую части числа и вывести полученное значение числа.
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
