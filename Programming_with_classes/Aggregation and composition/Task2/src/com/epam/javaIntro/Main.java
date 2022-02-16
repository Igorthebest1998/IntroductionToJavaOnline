package com.epam.javaIntro;

/*
 * 2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать,
 * заправляться, менять колесо, вывести на консоль марку автомобиля.
 */

public class Main {
	
	public static void main(String[] args) {
		
		Car car = new Car("Audi", "Petrol", 8, 3500, "Summer wheel", 350);
		car.go();
		car.refuel();
		car.exchangeWheels("Winter wheel", 380);
		System.out.println(car.getBrand());
		System.out.println(car);
	}

}
