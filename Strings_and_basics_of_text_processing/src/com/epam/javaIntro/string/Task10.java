package com.epam.javaIntro.string;

/*
 * 10.������ X ������� �� ���������� �����������, ������ �� ������� ��������� ������,
 *    ��������������� ��� �������������� ������. ���������� ���������� ����������� � ������ X.
 */

public class Task10 {

	public static void main(String[] args) {
		
		String text = "This programm is very important. " + 
				"This is very important! Really? Yes!";
		
		int count = 0;
		for(int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			if (letter == '.' || letter == '!' || letter == '?') {
				count++;
			}
		}
		
		System.out.print("Count: " + count);
	}
}
