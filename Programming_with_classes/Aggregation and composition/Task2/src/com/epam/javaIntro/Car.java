package com.epam.javaIntro;

import java.util.Arrays;

public class Car {
	
	private String brand;
	private Motor motor;
	private Wheel[] wheels;
	
	public Car(String brand, String motorType, int motorCountCylindres, 
			int motorVolume, String wheelType, int wheelDiametr) {
		this.brand = brand;
		this.motor = new Motor(motorType, motorCountCylindres, motorVolume);
		wheels = new Wheel[4];
		for (int i = 0; i < wheels.length; i++) {
			this.wheels[i] = new Wheel(wheelType, wheelDiametr);
		}
	}
	
	public Car() {
		super();
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", motor=" + motor + ", wheels=" + Arrays.toString(wheels) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((motor == null) ? 0 : motor.hashCode());
		result = prime * result + Arrays.hashCode(wheels);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (motor == null) {
			if (other.motor != null)
				return false;
		} else if (!motor.equals(other.motor))
			return false;
		if (!Arrays.equals(wheels, other.wheels))
			return false;
		return true;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Wheel[] getWheels() {
		return wheels;
	}

	public void setWheels(Wheel[] wheels) {
		this.wheels = wheels;
	}
	
	public void go() {
		System.out.println("Car goes");
	}
	
	public void stop() {
		System.out.println("Car stops");
	}
	
	public void refuel() {
		System.out.println("Car was refueled");
	}
	
	public void exchangeWheels(String wheelType, int wheelDiametr) {
		for(Wheel wheel : wheels) {
			wheel.exchange(new Wheel(wheelType, wheelDiametr));
		}
	}

}
