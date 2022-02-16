package com.epam.javaIntro.decomposition;

/*
 * 13.Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43). 
 *    Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n  -  заданное натуральное число больше 2.
 *    Для решения задачи использовать декомпозицию.
 */

public class Task13 {

    public static void main(String[] args){

        int n = 40;
       getArrayTwins(n);
    }

    public static boolean isPrimitive(int a){

        boolean isPrimitive = true;
        for (int i = 3; i * i <= a; i += 2){
            if (a % i == 0){
                isPrimitive = false;
                break;
            }
        }
        return isPrimitive;
    }

    public static void getArrayTwins(int n){

        int endIndex = 2 * n;
        int startIndex;
        if(n % 2 == 0) {
            startIndex = n + 1;
        }
        else startIndex = n;
        for(int i = startIndex; i < endIndex - 1; i += 2){
            if (isPrimitive(i) && isPrimitive(i + 2)){
                System.out.println(i + "; " + (i + 2));
            }
        }
    }
}
