package com.epam.javaIntro.string;

/*
 * 2.� ������ �������� ����� ������� ������� 'a' ������ 'b'.
 */

public class Task2 {
	
	public static void main(String[] args) {
		
		String text = "This programm is very important. It replaces a";
		
		String newText = text.replace("a", "ab");
		
		System.out.println(newText);
	}

}
