package com.epam.javaIntro.branchingAlgorithm;

/*
 * 3.Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.  
 */

public class Task3 {

    public static void main(String[] args) {
	// write your code here
        double x1 = 2;
        double y1 = 3;
        double x2 = 8;
        double y2 = 0;
        double x3 = 4;
        double y3 = 2;
        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1))
            System.out.println("The points are located on the same line");
        else
            System.out.println("The points aren't located on the same line");
    }
}
