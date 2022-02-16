package com.epam.javaIntro.sortArray;

/*
 * 8.ƒаны дроби p1/q1, p2/q2, ..., pn/qn (pi, qi - натуральнае). —оставить программу,
 *   котора€ приводит эти дроби к общему знаменателю и упор€дочивает их в пор€дке возрастани€.
 */

public class Task8 {

    public static void main(String[] args) {

        int[] numerators = new int[]{
                -6, -3, -1, 0, 3, 5, 6, 8, 11, 12
        };
        int[] denominators = new int[]{
                3, 5, 2, 6, 4, 9, 12, 4, 2, 10
        };

        int commonDenominator = denominators[0];
        for (int i = 1; i < denominators.length; i++){
            commonDenominator = nok(commonDenominator, denominators[i]);
        }
        for (int i = 0; i < numerators.length; i++){
            numerators[i] = numerators[i] * (commonDenominator / denominators[i]);
        }
        for (int i = 0; i < numerators.length - 1; i++){
            for (int j = 0; j < numerators.length - i - 1; j++){
                if (numerators[j] > numerators[j + 1]){
                    int currentElement = numerators[j];
                    numerators[j] = numerators[j + 1];
                    numerators[j + 1] = currentElement;
                }
            }
        }
        for (int i : numerators){
            System.out.print(i + "/" + commonDenominator + " ");
        }
    }

    public static int nok(int a, int b){

        return (a * b) / nod(a, b);
    }

    public static int nod(int a, int b) {

        if (a % b == 0) return b;
        if (b % a == 0) return a;
        if (a > b) return nod(a % b, b);
        else return nod(b % a, a);
    }
}
