package com.epam.javaIntro.sortArray;

/*
 * 5. Сортировка вставками. Дана последовательность чисел а1, а1, ..., an. Требуется переставить
 * числа в порядке возрастания. Делается это следующим образом. Пусть a1, a2, ..., ai - упорядоченная
 * последовательность, т.е. a1<=a2<=...<=ai. Берется следующее число ai+1 и вставляется в
 * последовательность так, чтобы новая последовательность тоже была возрастающей. Процесс
 * производится до тех пор, пока все элементы не будут перебраны. Примечание. Место помещения
 * очередного элемента в отсортированную часть производить с помощью двоичного поиска.
 * Двоичный поиск оформить в виде отдельной функции.
 */

public class Task5 {

    public static void main(String[] args){

        int[] array = new int[]{
                -3, 8, 0, 11, 5, -6, 12, 3, 6, -1, 6
        };
        for (int i = 1; i < array.length; i++){
            int positionInsert = binarySearch(array, i, array[i]);
            int currentElement = array[i];
            for (int j = i; j > positionInsert; j--){
                array[j] = array[j - 1];
            }
            array[positionInsert] = currentElement;
        }
        for (int i : array){
            System.out.print(i + " ");
        }
    }

    public static int binarySearch(int[] array, int length, int key){
        int l = -1;
        int r = length;
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
