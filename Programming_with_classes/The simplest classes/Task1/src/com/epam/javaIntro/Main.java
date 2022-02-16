package com.epam.javaIntro;

/*
 * 1.Создайте  класс Test1  двумя переменными. Добавьте  метод  вывода на экран и методы  изменения этих 
 *	 переменных. Добавьте  метод, который  находит сумму значений этих переменных, и метод,  который  находит 
 *	 наибольшее значение из этих двух переменных.
 */

public class Main {
	
	public static void main(String[] args) {
		
		Test1 test = new Test1(3, 8);
		test.print();
		System.out.println(test.sum());
		System.out.println(test.max());
	}

}
