package com.epam.javaIntro.string;

/*
 * 4.� ������� ������� ����������� � �������� ������������ ��������� �� ������ ����� ������������� ����� �����.
 */

public class Task4 {
	
	public static void main(String[] args) {
	
	String informatics = "�����������";
	String cake = "";
	
	cake += informatics.charAt(informatics.indexOf("�"));
	cake += informatics.charAt(informatics.indexOf("�"));
	cake += informatics.charAt(informatics.indexOf("�"));
	cake += informatics.charAt(informatics.indexOf("�"));
	
	System.out.print(cake);
	}
}
