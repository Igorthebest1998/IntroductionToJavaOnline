package com.epam.javaIntro.decomposition;

/*
 * 15.Найти  все  натуральные  n-значные  числа,  цифры  в  которых  образуют  строго  возрастающую 
 *    последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию. 
 */

public class Task15 {

    public static void main(String[] args){

        int n = 2;
        for (int i = 0; i < Math.pow(10, n); i++){
            if (isIncreasing(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isIncreasing(int a){

        int currentDigit = a % 10;
        a /= 10;
        boolean isIncreasing = false;
        while(a > 0){
            if(a % 10 < currentDigit){
                isIncreasing = true;
                break;
            }
            else{
                currentDigit = a % 10;
                a /= 10;
            }
        }
        return isIncreasing;
    }
}
