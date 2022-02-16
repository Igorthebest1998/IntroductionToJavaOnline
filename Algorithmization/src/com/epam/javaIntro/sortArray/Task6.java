package com.epam.javaIntro.sortArray;

/*
 * 6.Сортировка Шелла. Дан  массив n действительных  чисел.  Требуется  упорядочить  его  по  возрастанию.
 *   Делается это следующим образом: сравниваются два соседних элемента ai и a(i+1). Если ai<=a(i+1), 
 *   то продвигаются на один элемент вперед. Если ai > a(i+1), то производится перестановка
 *   и сдвигаются на один элемент назад. Составить алгоритм этой сортировки.
 */

public class Task6 {

    public static void main(String[] args){

        int[] array = new int[]{
                -3, 8, 0, 11, 5, -6, 12, 3, 6, -1, 6
        };
        int i = 0;
        while (i < array.length - 1){
            if (array[i] <= array[i + 1]){
                i++;
            }
            else {
                int currentElement = array[i];
                array[i] = array[i + 1];
                array[i + 1] = currentElement;
                if (i > 0)
                i--;
            }
        }
        for(int j : array){
            System.out.print(j + " ");
        }
    }
}
