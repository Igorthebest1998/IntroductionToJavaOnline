package com.epam.javaIntro;

/*
 * 5.ќпишите класс, реализующий дес€тичный счетчик, который может 
 *   увеличивать или уменьшать свое значение на  единицу  в  заданном  диапазоне.
 *   ѕредусмотрите инициализацию  счетчика  значени€ми  по  умолчанию  и произвольными  значени€ми.
 *   —четчик  имеет методы увеличени€  и  уменьшени€ состо€ни€, и  метод позвол€ющий получить его текущее состо€ние.
 *   Ќаписать код, демонстрирующий все возможности класса.
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
