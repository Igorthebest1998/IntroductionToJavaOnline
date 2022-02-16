package com.epam.javaIntro.main;

import com.epam.javaIntro.entity.Payment;

/*
 * Задача 2.  
 * Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из 
 * нескольких товаров.
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
