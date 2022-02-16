package com.epam.javaIntro.array;

/*
 * 2.Замените в строке все вхождения 'word' на 'letter'. 
 */

public class Task2 {
	
	public static void main (String[] args) {
		
		String text = "My word, my cat, dog, word, word. Hello, bye";
		char[] chars = text.toCharArray();
		String newText = "";
		
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == 'w' && chars[i + 1] == 'o' &&
					chars[i + 2] == 'r' && chars[i + 3] == 'd') {
						newText += "letter";
						i += 3;						
			}
			else newText += chars[i];
		}
		
		System.out.print(newText);
	}

}
