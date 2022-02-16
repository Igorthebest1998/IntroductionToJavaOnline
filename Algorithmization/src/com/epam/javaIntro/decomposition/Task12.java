package com.epam.javaIntro.decomposition;

/*
 * 12.Даны натуральные числа К и N.  Написать метод(методы)  формирования массива А, элементами которого 
 *    являются числа, сумма цифр которых равна К и которые не большее N.
 */

public class Task12 {

    public static void main(String[] args){

        int n = 4;
        int k = 25;
        int[] array = getArray(n, k);
        for(int i : array){
            System.out.println(i);
        }
    }

    public static int getDigits(int a){

        int digitNumber = 0;
        while(a > 0){
            digitNumber += a % 10;
            a /= 10;
        }
        return digitNumber;
    }

    public static int[] getArray(int a, int b){

        int length = 0;
        for (int i = 0; i <= b; i++){
            if (getDigits(i) == a){
                length++;
            }
        }

        int[] array = new int[length];
        int currentIndex = 0;
        for (int i = 0; i <= b; i++){
            if (getDigits(i) == a){
                array[currentIndex] = i;
                currentIndex++;
            }
        }

        return array;
    }

}
