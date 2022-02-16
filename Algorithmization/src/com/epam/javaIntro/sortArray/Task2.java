package com.epam.javaIntro.sortArray;

/*
 * 2.Даны две последовательности a1<=a2<=3<=...<=an и b1<=b2<=b3<=...<=bn. 
 *   Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей.
 *   Примечание.Дополнительный массив не использовать.
 */

public class Task2 {

    public static void main(String[] args){

        int[] firstArray = new int[]{
                1, 2, 4, 6, 7, 9, 10
        };
        int[] secondArray = new int[]{
                -2, 0, 2, 5, 6, 8, 10, 13, 19
        };
        int[] resultArray = new int[firstArray.length + secondArray.length];
        int elementFirst = 0;
        int elementSecond = 0;
        int elementResult = 0;
        while ((elementFirst < firstArray.length) && (elementSecond < secondArray.length)){
            if (firstArray[elementFirst] < secondArray[elementSecond]){
                resultArray[elementResult] = firstArray[elementFirst];
                elementFirst++;
            }
            else {
                resultArray[elementResult] = secondArray[elementSecond];
                elementSecond++;
            }
            elementResult++;
        }
        if (elementFirst == firstArray.length){
            while (elementResult < resultArray.length){
                resultArray[elementResult] = secondArray[elementSecond];
                elementResult++;
                elementSecond++;
            }
        }
        else {
            while (elementResult < resultArray.length){
                resultArray[elementResult] = firstArray[elementFirst];
                elementResult++;
                elementFirst++;
            }
        }
        for (int i : resultArray){
            System.out.println(i + " ");
        }
    }
}
