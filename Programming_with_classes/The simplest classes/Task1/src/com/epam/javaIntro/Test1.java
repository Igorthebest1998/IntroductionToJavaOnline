package com.epam.javaIntro;

public class Test1 {
	
	private int a;
	private int b;
	
	public Test1(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public Test1() {
		super();
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "Test1 [a=" + a + ", b=" + b + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + b;
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
		Test1 other = (Test1) obj;
		if (a != other.a)
			return false;
		if (b != other.b)
			return false;
		return true;
	}
	
	public int sum() {
		return a + b;
	}
	
	public int max() {
		if (a > b) return a;
		else return b;
	}
	
	public void print() {
		System.out.println(a + " " + b);
	}

}
