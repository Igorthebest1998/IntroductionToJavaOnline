package com.epam.javaIntro.view;

import java.util.List;

import com.epam.javaIntro.entity.Airline;

public class AirlineView {

	private static AirlineView instance;
	
	private AirlineView() {}
	
	public static AirlineView getInstance() {
		if (instance == null) {
			instance = new AirlineView();
		}
		return instance;
	}
	
	public void print(List<Airline> airlines) {
		System.out.println(airlines);
	}
}
