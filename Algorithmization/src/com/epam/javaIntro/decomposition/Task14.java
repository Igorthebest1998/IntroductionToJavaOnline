package com.epam.javaIntro.decomposition;

/*
 * 14.Натуральное  число,  в  записи  которого  n  цифр,  называется  числом  Армстронга,  если  сумма  его  цифр, 
 *	  возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k.  Для решения задачи использовать декомпозицию. 
 */

public class Task14 {

    public static void main(String[] args){

        int k = 200;
        for (int i = 0; i < k; i++){
            if(isArmstrongNumber(i)){
                System.out.println(i);
            }
        }
    }

    public static int sumDigit(int a){

        int digitNumber = 0;
        int countDigit = countDigit(a);
        while(a > 0){
            digitNumber += Math.pow(a % 10, countDigit);
            a /= 10;
        }
        return digitNumber;
    }

    public static int countDigit(int a){

        int countDigit = 0;
        while(a > 0){
            countDigit++;
            a /= 10;
        }
        return countDigit;
    }

    public static boolean isArmstrongNumber(int n){

        if (sumDigit(n) == n){
            return true;
        }
        else return false;
    }
}
