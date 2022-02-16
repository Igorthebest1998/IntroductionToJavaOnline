package com.epam.javaIntro.array;

/*
 * 3.В строке найти количество цифр.
 */

public class Task3 {
	
	public static void main(String[] args) {
		
		String text = "I had 100 dollars, but I lost 12 and find 15.5.";
		int countNumber = 0;
		char[] chars = text.toCharArray();
		
		for (int i = 0; i < chars.length; i++) {
			if ((int)chars[i] >= 48 && (int)chars[i] <= 57) {
				countNumber++;
			}
		}
		
		System.out.print("CountNumber: " + countNumber);
	}

}
