package com.epam.javaIntro.decomposition;

/*
 * 10.Äàíî  íàòóğàëüíîå  ÷èñëî  N.  Íàïèñàòü  ìåòîä(ìåòîäû)  äëÿ  ôîğìèğîâàíèÿ  ìàññèâà,  ıëåìåíòàìè  êîòîğîãî 
 *	  ÿâëÿşòñÿ öèôğû ÷èñëà N. 
 */

public class Task10 {

    public static void main(String[] args){

        int n = 6547389;
        int[] array = toArray(n);
        for (int i : array){
            System.out.println(i);
        }
    }

    public static int[] toArray(int n){

        String number = String.valueOf(n);
        int length = number.length();
        int[] array = new int[length];
        for (int i = number.length() - 1; i >= 0; i--){
            array[i] = n % 10;
            n /= 10;
        }
        return array;
    }
}
