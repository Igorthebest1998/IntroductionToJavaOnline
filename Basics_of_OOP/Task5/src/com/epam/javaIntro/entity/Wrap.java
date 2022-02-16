package com.epam.javaIntro.entity;

public class Wrap {
	
	private WrapType type;
	private double price;
	
	public Wrap() {
		super();
	}

	public Wrap(WrapType type, double price) {
		super();
		this.type = type;
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("Wrap: type=%s, price=%.2f",type, price);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Wrap other = (Wrap) obj;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	public WrapType getType() {
		return type;
	}

	public void setType(WrapType type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public static enum WrapType{
		POLYETELINE("Полиэтиленовая"),
		PAPER("Бумажная"),
		UNINENDIFIEND("Неопознано");
		
		private final String value;
		
		private WrapType(String value) {
			this.value = value;
		}
		
		public String getValue() {
			return value;
		}
	}

}
