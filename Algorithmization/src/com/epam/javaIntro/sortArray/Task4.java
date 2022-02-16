package com.epam.javaIntro.sortArray;

/*
 * 4.Сортировка  обменами. Дана  последовательность  чисел a1>=a2>=a3>=...>=an.
 *   Требуется  переставить  числа  в порядке  возрастания. 
 *   Для  этого  сравниваются  два  соседних  числа ai и a(i+1). 
 *   Если ai > a(i+1),  то  делается перестановка.
 *   Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
 *   Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
 */

public class Task4 {

    public static void main(String[] args){

        int[] array = new int[]{
                -3, 8, 0, 11, 5, -6, 12, 3, 6, -1
        };
        int countExchange = 0;
        for (int i = 0; i < array.length - 1; i++){
            for (int j = 0; j < array.length - i - 1; j++){
                if (array[j] > array[j + 1]){
                    int currentElement = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = currentElement;
                    countExchange++;
                }
            }
        }
        for (int i : array){
            System.out.print(i + " ");
        }
        System.out.println("Count exchange: " + countExchange);
    }
}
