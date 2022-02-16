package com.epam.javaIntro.decomposition;

/*
 * 4.Ќа плоскости заданы своими координатами n точек. Ќаписать метод(методы), определ€ющие, между какими 
 *	 из пар точек самое большое рассто€ние. ”казание.  оординаты точек занести в массив. 
 */

import java.awt.*;

public class Task4 {

    public static void main(String[] args){

        Point[] points = new Point[]
                {new Point(3,6), new Point(5,6), new Point(-3, -5),
                new Point(7,2)};
        System.out.printf("Max distance: %.2f", maxDistance(points));
    }

    public static double distance(Point firstPoint, Point secondPoint){

        double distance = Math.sqrt(Math.pow(secondPoint.x - firstPoint.x, 2) +
                Math.pow(secondPoint.y - firstPoint.y, 2));
        return distance;
    }

    public static double maxDistance(Point[] points){

        double max = 0;
        for (int i = 0; i < points.length; i++)
            for (int j = i + 1; j < points.length; j++){
                double distance = distance(points[i], points[j]);
                if (distance > max) max = distance;
            }
        return max;
    }
}
