package com.epam.javaIntro.string;

/*
 * 3.ѕроверить, €вл€етс€ ли заданное слово палиндромом. 
 */

public class Task3 {
	
	public static void main(String[] args) {
		
		String text = "Radar";
		
		StringBuilder tempText = new StringBuilder(text);
		tempText.reverse();
		System.out.print(text.equalsIgnoreCase(tempText.toString()));
	}

}
