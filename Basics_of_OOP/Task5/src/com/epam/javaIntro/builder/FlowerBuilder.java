package com.epam.javaIntro.builder;

import com.epam.javaIntro.entity.Flower;

public class FlowerBuilder {

	private String name;
	private String color;
	private double price;
	
	public FlowerBuilder() {
	}
	
	public Flower build() {
		return new Flower(name, color, price); 
	}

	public String getName() {
		return name;
	}

	public FlowerBuilder setName(String name) {
		if(name == null || name.equals("")) {
			throw new IllegalArgumentException("Flower must have name");
		} else {
			this.name = name;
		}	
		return this;
	}

	public String getColor() {
		return color;
	}

	public FlowerBuilder setColor(String color) {
		this.color = color;
		return this;
	}

	public double getPrice() {
		return price;
	}

	public FlowerBuilder setPrice(double price) {
		if (price < 0) {
			System.out.println("Incorrect price value!");
			this.price = 0;
		} else {
			this.price = price;
		}
		return this;
	}
}
