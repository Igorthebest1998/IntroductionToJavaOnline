package com.epam.javaIntro.entity;

public class Voucher {
	
	private String country;
	private int countOfDays;
	private int price;
	VoucherType type;
	TransportType transport;
	FoodType food;
	
	public Voucher() {
		super();
	}

	public Voucher(String country, int countOfDays, int price, VoucherType type, TransportType transport,
			FoodType food) {
		super();
		this.country = country;
		this.countOfDays = countOfDays;
		this.price = price;
		this.type = type;
		this.transport = transport;
		this.food = food;
	}

	@Override
	public String toString() {
		return "Voucher [country=" + country + ", countOfDays=" + countOfDays + ", price=" + price + ", type=" + type
				+ ", transport=" + transport + ", food=" + food + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + countOfDays;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((food == null) ? 0 : food.hashCode());
		result = prime * result + price;
		result = prime * result + ((transport == null) ? 0 : transport.hashCode());
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
		Voucher other = (Voucher) obj;
		if (countOfDays != other.countOfDays)
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (food != other.food)
			return false;
		if (price != other.price)
			return false;
		if (transport != other.transport)
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getCountOfDays() {
		return countOfDays;
	}

	public void setCountOfDays(int countOfDays) {
		this.countOfDays = countOfDays;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public VoucherType getType() {
		return type;
	}

	public void setType(VoucherType type) {
		this.type = type;
	}

	public TransportType getTransport() {
		return transport;
	}

	public void setTransport(TransportType transport) {
		this.transport = transport;
	}

	public FoodType getFood() {
		return food;
	}

	public void setFood(FoodType food) {
		this.food = food;
	}

}
