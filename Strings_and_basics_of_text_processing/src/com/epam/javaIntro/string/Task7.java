package com.epam.javaIntro.string;

/*
 * 7.�������� ������. ��������� ������� �� ��� ������������� ������� � ��� �������. ��������, ���� ���� ������� 
 *	 "abc cde def", �� ������ ���� �������� "abcdef". 
 */

public class Task7 {
	
	public static void main (String[] args) {
		
		StringBuilder text = new StringBuilder("This programm is very important");
		
		int i = 0;
		while (i < text.length()) {	
			int lastIndex = text.lastIndexOf(Character.toString(text.charAt(i)));
			if (text.charAt(i) == ' ') {
				text.deleteCharAt(i);
			}
			else if (i != lastIndex) {						
						text.deleteCharAt(lastIndex);
				}
			else i++;
		}
		
		System.out.print(text);
	}

}
