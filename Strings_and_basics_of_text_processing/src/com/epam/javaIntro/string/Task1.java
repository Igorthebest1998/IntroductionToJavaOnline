package com.epam.javaIntro.string;

/*
 * 1.ƒан текст (строка). Ќайдите наибольшее количество подр€д идущих пробелов в нем. 
 */

public class Task1 {
	
	public static void main(String[] args) {
		
		String text = "This programm        is   very  important";
		
		int countWhitespace = 0;
		int max = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == ' ') {
				countWhitespace++;
				if (countWhitespace > max) max = countWhitespace;
			}
			else countWhitespace = 0;
		}
		
		System.out.print("Max Whitespaces: " + max);
	}

}
