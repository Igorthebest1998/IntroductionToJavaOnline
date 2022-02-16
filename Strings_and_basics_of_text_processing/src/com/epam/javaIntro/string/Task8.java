package com.epam.javaIntro.string;

/*
 * 8.¬водитс€ строка слов, разделенных пробелами. Ќайти самое длинное слово и вывести его на экран.
 *	 —лучай, когда самых длинных слов может быть несколько, не обрабатывать. 
 */

public class Task8 {
	
	public static void main(String[] args) {
		
		String text = "This programm is very important";
		String[] chars = text.split(" ");
		
		int max = 0;
		int maxIndex = 0;
		for(int i = 0; i < chars.length; i++) {
			if (chars[i].length() > max) {
				max = chars[i].length();
				maxIndex = i;
			}
		}
		
		System.out.print("The longest word: " + chars[maxIndex]);
	}

}
