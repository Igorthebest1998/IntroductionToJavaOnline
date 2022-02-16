package com.epam.javaIntro.string;

/*
 * 9.ѕосчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. 
 *   ”читывать только английские буквы.
 */

import java.lang.Character.UnicodeBlock;

public class Task9 {
	
	public static void main(String[] args) {
		
		String text = "This programm is VERY important";
		int countLowerCase = 0;
		int countUpperCase = 0;
		
		for (int i = 0; i < text.length(); i++) {
			UnicodeBlock charUnicode = Character.UnicodeBlock.of(text.charAt(i));
			UnicodeBlock englishUnicode = Character.UnicodeBlock.BASIC_LATIN;
			if (charUnicode.equals(englishUnicode)) {
				if (Character.isLowerCase(text.charAt(i))) countLowerCase++;
				else if (Character.isUpperCase(text.charAt(i))) countUpperCase++;
			}
		}
		
		System.out.println("Lower Case chars: " + countLowerCase);
		System.out.println("Upper Case chars: " + countUpperCase);
	}

}
