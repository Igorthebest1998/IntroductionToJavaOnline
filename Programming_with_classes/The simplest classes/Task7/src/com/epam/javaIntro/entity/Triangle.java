package com.epam.javaIntro.entity;

public class Triangle {
	
	private Point a;
	private Point b;
	private Point c;
	
	public Triangle() {
		super();
	}

	public Triangle(Point a, Point b, Point c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public String toString() {
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + ", ab=" + getAB() +
				", bc=" + getBC() + ", ca=" + getCA() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((a == null) ? 0 : a.hashCode());
		result = prime * result + ((b == null) ? 0 : b.hashCode());
		result = prime * result + ((c == null) ? 0 : c.hashCode());
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
		Triangle other = (Triangle) obj;
		if (a == null) {
			if (other.a != null)
				return false;
		} else if (!a.equals(other.a))
			return false;
		if (b == null) {
			if (other.b != null)
				return false;
		} else if (!b.equals(other.b))
			return false;
		if (c == null) {
			if (other.c != null)
				return false;
		} else if (!c.equals(other.c))
			return false;
		return true;
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}
	
	public double getAB() {
		return CalculateSide(a, b);
	}
	
	public double getBC() {
		return CalculateSide(b, c);
	}
	
	public double getCA() {
		return CalculateSide(c, a);
	}
	
	public double CalculateSide(Point a, Point b) {
		double side = Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + 
				Math.pow(a.getY() - b.getY(), 2));
		return side;
	}

}
