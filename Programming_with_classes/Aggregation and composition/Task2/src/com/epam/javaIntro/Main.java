package com.epam.javaIntro;

/*
 * 2. ������� ������ ������ ����������, ��������� ������ ������, ���������. ������: �����,
 * ������������, ������ ������, ������� �� ������� ����� ����������.
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
