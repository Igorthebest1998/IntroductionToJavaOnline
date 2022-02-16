package com.epam.javaIntro.decomposition;

/*
 * 16.Написать  программу,  определяющую  сумму  n  -  значных  чисел,  содержащих  только  нечетные  цифры. 
 *	  Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию. 
 */

public class Task16 {

    public static void main(String[] args){

        int n = 2;
        int sum = 0;
        for(int i = 0; i < Math.pow(10, n); i++){
            if(isOdd(i)){
                sum += i;
            }
        }
        System.out.print("Sum: " + sum + "; count even digits: " + countEven(sum));
    }

    public static boolean isOdd(int a){

        boolean isOdd = true;
        while(a > 0){
            if ((a % 10) % 2 == 0){
                isOdd = false;
                break;
            }
            a /= 10;
        }
        return isOdd;
    }

    public static int countEven(int a){

        int count = 0;
        while(a > 0){
            if ((a % 10) % 2 == 0) count++;
            a /= 10;
        }
        return count;
    }
}
