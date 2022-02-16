package com.epam.javaIntro;

/*
 * 2.Создйте класс  Test2 двумя  переменными.  Добавьте конструктор  с  входными  параметрами.  Добавьте 
 *	 конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра 
 *	 класса. 
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
