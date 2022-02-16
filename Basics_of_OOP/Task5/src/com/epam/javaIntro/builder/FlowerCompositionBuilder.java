package com.epam.javaIntro.builder;

import java.util.ArrayList;
import java.util.List;

import com.epam.javaIntro.entity.Flower;
import com.epam.javaIntro.entity.FlowerComposition;
import com.epam.javaIntro.entity.Wrap;

public class FlowerCompositionBuilder {

	private List<Flower> flowers;
	private Wrap wrap;
	private double price;
	
	public FlowerCompositionBuilder() {
		this.flowers = new ArrayList<Flower>();
	}
	
	public FlowerCompositionBuilder addFlower(Flower flower) {
		this.flowers.add(flower);
		this.price += flower.getPrice();
		return this;
	}
	
	public FlowerComposition build() {
		return new FlowerComposition(wrap, flowers, price);
	}

	public List<Flower> getFlowers() {
		return flowers;
	}

	public FlowerCompositionBuilder setFlowers(List<Flower> flowers) {
		this.flowers = flowers;
		return this;
	}

	public Wrap getWrap() {
		return wrap;
	}

	public FlowerCompositionBuilder setWrap(Wrap wrap) {
		this.wrap = wrap;
		return this;
	}

	public double getPrice() {
		return price;
	}

	public FlowerCompositionBuilder setPrice(double price) {
		this.price = price;
		return this;
	}
}
