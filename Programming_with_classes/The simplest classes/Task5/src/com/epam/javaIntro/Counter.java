package com.epam.javaIntro;

public class Counter {
	
	private int count;
	private int max;
	private int min;

	public Counter() {
		this(1, 30, 0);
	}	

	public Counter(int count, int max, int min) {
		super();
		this.count = count;
		this.max = max;
		this.min = min;
	}

	@Override
	public String toString() {
		return "Counter [count=" + count + ", max=" + max + ", min=" + min + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + count;
		result = prime * result + max;
		result = prime * result + min;
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
		Counter other = (Counter) obj;
		if (count != other.count)
			return false;
		if (max != other.max)
			return false;
		if (min != other.min)
			return false;
		return true;
	}

	public int getCount() {
		return count;
	}

	
	public void increase() {
		if (count < max) {
			count++;
		} else count = min;
	}
	
	public void decrease() {
		if (count < min) {
			count--;
		} else count = max;		
	}
	
	public void print() {
		System.out.println("Current info: " + count + " min=" + min + " max=" + max);
	}
}
