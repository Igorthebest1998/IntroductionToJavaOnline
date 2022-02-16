package com.epam.javaIntro.string;

/*
 * 5.Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
 */

public class Task5 {
	
	public static void main(String[] args) {
		
		String text = "This programm is very important. It finds a";
		int countA = 0;
		
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == 'a') countA++;
		}
		
		System.out.print("Count a: " + countA);
	}

}
