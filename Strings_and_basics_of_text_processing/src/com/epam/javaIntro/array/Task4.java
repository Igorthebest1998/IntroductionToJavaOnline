package com.epam.javaIntro.array;

/*
 * 4.В строке найти количество чисел.
 */

public class Task4 {
	
	public static void main(String[] args) {
		
		String text = "I had 100 dollars, but I lost 12 and find 15.";
		int countNumber = 0;
		char[] chars = text.toCharArray();
		
		for (int i = 0; i < chars.length; i++) {
			if (isNumber(chars[i]) && !isNumber(chars[i + 1])) {
				countNumber++;
			}
		}
		
		System.out.print("CountNumbers: " + countNumber);
	}
	
	public static boolean isNumber(char ch) {
		
		if ((int)ch >= 48 && (int)ch <= 57) return true;
		else 
			return false;
	}

}
