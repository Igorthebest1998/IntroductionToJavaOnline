package com.epam.javaIntro.string;

/*
 * 6.Из заданной строки получить новую, повторив каждый символ дважды. 
 */

public class Task6 {

	public static void main (String[] args) {
		
		StringBuilder text = new StringBuilder("This programm is very important");
		
		for (int i = 0; i < text.length(); i = i + 2) {
			text.insert(i, text.charAt(i));
		}
		
		System.out.print(text);
	}
}
