package com.epam.javaIntro.main;

import com.epam.javaIntro.entity.Payment;

/*
 * ������ 2.  
 * ������� ����� Payment � ���������� �������, � ������� �������� �������� ����� ������������ ������� �� 
 * ���������� �������.
 */

public class Main {
	
	public static void main(String[] args) {
		
		Payment payment = new Payment();
		payment.addPurchase("Meat", 150);
		payment.addPurchase("Milk", 80);
		payment.addPurchase("Bread", 120);
		payment.addPurchase("Beer", 200);
		payment.print();
		payment.deletePurchase("Milk", 80);
		payment.print();
	}

}
