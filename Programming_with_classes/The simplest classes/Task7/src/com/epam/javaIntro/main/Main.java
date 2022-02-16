package com.epam.javaIntro.main;

import com.epam.javaIntro.entity.Point;
import com.epam.javaIntro.entity.Triangle;
import com.epam.javaIntro.logic.TriangleLogic;
import com.epam.javaIntro.view.TriangleView;

/*
 * 7.Описать класс, представляющий треугольник.
 *   Предусмотреть методы для создания объектов, вычисления площади, периметра 
 *   и точки пересечения медиан.
 */

public class Main {
	
	public static void main(String[] args) {
		
		Point a = new Point(1, 1);
		Point b = new Point(2, 3);
		Point c = new Point(5,-1);
		Triangle triangle = new Triangle(a, b, c);
		
		TriangleView view = new TriangleView();
		TriangleLogic logic = new TriangleLogic();
		
		double perimeter = logic.perimeter(triangle);
		view.print(perimeter);
		double square = logic.square(triangle);
		view.print(square);
		Point insectionPoint = logic.intersectionPoint(triangle);
		view.print(insectionPoint);
		view.print(triangle);
	}

}
