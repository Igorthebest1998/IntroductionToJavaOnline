package com.epam.javaIntro;

/*
 * 5.������� �����, ����������� ���������� �������, ������� ����� 
 *   ����������� ��� ��������� ���� �������� ��  �������  �  ��������  ���������.
 *   ������������� �������������  ��������  ����������  ��  ���������  � �������������  ����������.
 *   �������  ����� ������ ����������  �  ���������� ���������, �  ����� ����������� �������� ��� ������� ���������.
 *   �������� ���, ��������������� ��� ����������� ������.
 */

public class Main {
	
	public static void main(String[] args) {
		
		Counter counter = new Counter();
		counter.print();
		counter.decrease();
		counter.decrease();
		counter.print();
		counter.increase();
		counter.print();
	}

}
