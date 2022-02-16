package com.epam.javaIntro.sortArray;

/*
 * 7.Пусть даны две неубывающие последовательности действительных чисел a1<=a2<=...<=an и b1<=b2<=...<=bm.
 *   Требуется указать те места, на которые нужно вставлять элементы последовательности b1<=b2<=...<=bm в
 *   первую последовательность так, чтобы новая последовательность оставалась возрастающей.
 */

public class Task7 {

    public static void main(String[] args){

        int[] a = new int[]{
                -6, -3, -1, 0, 3, 5, 6, 8, 11, 12
        };
        int[] b = new int[]{
                -12, -5, -2, 0, 1, 2, 3, 6, 8, 9, 11
        };
        int[] resultArray = new int[a.length + b.length];
        for ( int i =0; i < a.length; i++){
            resultArray[i] = a[i];
        }
        for (int i = 0; i < b.length; i++){
            int positionInsert = binarySearch(resultArray, b[i]);
            for (int j = a.length + i; j > positionInsert; j--){
                resultArray[j] = resultArray[j - 1];
            }
            resultArray[positionInsert] = b[i];
        }
        for (int i : resultArray){
            System.out.print(i + " ");
        }
    }

    public static int binarySearch(int[] array, int key){

        int l = -1;
        int r = array.length;
        while (l < r - 1){
            int m = (l + r) / 2;
            if (array[m] < key){
                l = m;
            }
            else {
                r = m;
            }
        }
        return r;
    }
}
