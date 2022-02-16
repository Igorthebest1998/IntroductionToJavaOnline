package com.epam.javaIntro.entity;

import java.util.ArrayList;
import java.util.List;

public class FlowerComposition {

	private Wrap wrap;
	private List<Flower> flowers;
	private double price;
	
	public FlowerComposition() {
		super();
		flowers = new ArrayList<Flower>();
	}

	public FlowerComposition(Wrap wrap, List<Flower> flowers, double price) {
		super();
		this.wrap = wrap;
		this.flowers = flowers;
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("FlowerComposition with %s wrap, flowers:\n %s", wrap, flowers);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((flowers == null) ? 0 : flowers.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((wrap == null) ? 0 : wrap.hashCode());
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
		FlowerComposition other = (FlowerComposition) obj;
		if (flowers == null) {
			if (other.flowers != null)
				return false;
		} else if (!flowers.equals(other.flowers))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (wrap == null) {
			if (other.wrap != null)
				return false;
		} else if (!wrap.equals(other.wrap))
			return false;
		return true;
	}

	public Wrap getWrap() {
		return wrap;
	}

	public void setWrap(Wrap wrap) {
		this.wrap = wrap;
	}

	public List<Flower> getFlowers() {
		return flowers;
	}

	public void setFlowers(List<Flower> flowers) {
		this.flowers = flowers;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void addFlower(Flower flower) {
		flowers.add(flower);
	}
}

