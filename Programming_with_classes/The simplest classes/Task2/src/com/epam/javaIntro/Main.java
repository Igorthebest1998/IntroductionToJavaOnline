package com.epam.javaIntro;

/*
 * 2.������� �����  Test2 �����  �����������.  �������� �����������  �  ��������  �����������.  �������� 
 *	 �����������, ���������������� ����� ������ �� ���������. �������� set- � get- ������ ��� ����� ���������� 
 *	 ������. 
 */

public class Main {
	
	public static void main(String[] args) {
		
		Test2 test = new Test2(1, 2);
		Test2 test2 = new Test2();
		test.setA(0);
		System.out.println(test);
		System.out.println(test2);
	}

}
