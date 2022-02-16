package com.epam.javaIntro.logic;

import com.epam.javaIntro.entity.Point;
import com.epam.javaIntro.entity.Triangle;

public class TriangleLogic {
	
	public TriangleLogic() {}
	
	public double perimeter(Triangle triangle) {
		return triangle.getAB() + triangle.getBC() + triangle.getCA();
	}
	
	public double square(Triangle triangle) {
		double p = perimeter(triangle) / 2;
		double square = Math.sqrt(p * (p - triangle.getAB()) * (p - triangle.getBC()) *
				(p - triangle.getCA()));
		return square;
	}
	
	public Point intersectionPoint(Triangle triangle) {
		Point a = triangle.getA();
		Point b = triangle.getB();
		Point c = triangle.getC();
		double x = (a.getX() + b.getX() + c.getX()) / 3;
		double y = (a.getY() + b.getY() + c.getY()) / 3;
		return new Point(x, y);
	}

}
