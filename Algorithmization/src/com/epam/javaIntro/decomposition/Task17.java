package com.epam.javaIntro.decomposition;

/*
 * 17.Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких 
 *    действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию. 
 */

public class Task17 {

    public static void main(String[] args){

        int n = 45;
        int count = countSubtraction(n);
        System.out.print("Count subtraction: " + count);
    }

    public static int sumDigit(int a){

        int sum = 0;
        while(a > 0){
            sum += a % 10;
            a /= 10;
        }
        return sum;
    }

    public static int countSubtraction(int a){

        int count = 0;
        while(a > 0){
            a -= sumDigit(a);
            count++;
        }
        return count;
    }
}
