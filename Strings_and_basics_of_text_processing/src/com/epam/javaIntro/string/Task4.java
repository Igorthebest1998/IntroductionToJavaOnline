package com.epam.javaIntro.string;

/*
 * 4.С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
 */

public class Task4 {
	
	public static void main(String[] args) {
	
	String informatics = "информатика";
	String cake = "";
	
	cake += informatics.charAt(informatics.indexOf("т"));
	cake += informatics.charAt(informatics.indexOf("о"));
	cake += informatics.charAt(informatics.indexOf("р"));
	cake += informatics.charAt(informatics.indexOf("т"));
	
	System.out.print(cake);
	}
}
