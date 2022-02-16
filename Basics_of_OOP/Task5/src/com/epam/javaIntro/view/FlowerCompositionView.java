package com.epam.javaIntro.view;

import com.epam.javaIntro.entity.FlowerComposition;

public class FlowerCompositionView {
	
	public void printFlowerComposition(FlowerComposition composition) {
		System.out.printf("Info about composition:\n"
				+ "Price: %s,\n"
				+ "Price of wrap: %s,\n"
				+ "Type of wrap: %s,\n"
				+ "flowers: %s\n", 
				composition.getPrice(),
				composition.getWrap().getPrice(),
				composition.getWrap().getType(), composition.getFlowers().toString());
	}

}
