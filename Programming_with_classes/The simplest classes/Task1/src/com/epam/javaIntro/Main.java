package com.epam.javaIntro;

/*
 * 1.��������  ����� Test1  ����� �����������. ��������  �����  ������ �� ����� � ������  ��������� ���� 
 *	 ����������. ��������  �����, �������  ������� ����� �������� ���� ����������, � �����,  �������  ������� 
 *	 ���������� �������� �� ���� ���� ����������.
 */

public class Main {
	
	public static void main(String[] args) {
		
		Test1 test = new Test1(3, 8);
		test.print();
		System.out.println(test.sum());
		System.out.println(test.max());
	}

}
