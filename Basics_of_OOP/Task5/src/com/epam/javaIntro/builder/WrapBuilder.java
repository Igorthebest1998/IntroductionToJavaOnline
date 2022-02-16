package com.epam.javaIntro.builder;

import com.epam.javaIntro.entity.Wrap;
import com.epam.javaIntro.entity.Wrap.WrapType;

public class WrapBuilder {

	private WrapType wrapType;
	public double price;
	
	public WrapBuilder() {
	}
	
	public Wrap build() {
		return new Wrap(wrapType, price);
	}

	public WrapType getWrapType() {
		return wrapType;
	}

	public WrapBuilder setWrapType(WrapType wrapType) {
		this.wrapType = wrapType;
		return this;
	}

	public double getPrice() {
		return price;
	}

	public WrapBuilder setPrice(double price) {
		if (price < 0) {
			System.out.println("Incorrect price value!");
			this.price = 0;
		} else {
			this.price = price;
		}
		return this;
	}
}
