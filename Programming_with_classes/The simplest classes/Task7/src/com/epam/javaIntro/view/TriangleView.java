package com.epam.javaIntro.view;

import com.epam.javaIntro.entity.Point;
import com.epam.javaIntro.entity.Triangle;

public class TriangleView {
	
	public TriangleView() {}
	
	public void print(double a) {
		System.out.printf("Result: %.3f \n", a);
	}
	
	public void print(Triangle triangle) {
		System.out.println(triangle);
	}
	
	public void print(Point point) {
		System.out.println(point);
	}

}
