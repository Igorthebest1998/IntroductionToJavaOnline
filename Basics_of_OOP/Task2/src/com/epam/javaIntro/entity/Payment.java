package com.epam.javaIntro.entity;

import java.util.ArrayList;
import java.util.List;

public class Payment {
	
	private List<Purchase> purchases;

	public Payment() {
		super();
		purchases = new ArrayList<Purchase>();
	}
	
	public Payment(List<Purchase> purchases) {
		super();
		this.purchases = purchases;
	}

	@Override
	public String toString() {
		return "Payment [purchases=" + purchases + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((purchases == null) ? 0 : purchases.hashCode());
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
		Payment other = (Payment) obj;
		if (purchases == null) {
			if (other.purchases != null)
				return false;
		} else if (!purchases.equals(other.purchases))
			return false;
		return true;
	}

	public List<Purchase> getPurchases() {
		return purchases;
	}

	public void setPurchases(List<Purchase> purchases) {
		this.purchases = purchases;
	}
	
	public void addPurchase(String name, int price) {
		Purchase purchase = new Purchase(name, price);
		this.purchases.add(purchase);
	}
	
	public void deletePurchase(String name, int price) {
		Purchase purchase = new Purchase(name, price);
		this.purchases.remove(purchase);
	}
	
	public void print() {
		System.out.println(purchases);
	}

	private class Purchase{
		
		private String name;
		private int price;
		
		public Purchase() {
			super();
		}

		public Purchase(String name, int price) {
			super();
			this.name = name;
			this.price = price;
		}

		@Override
		public String toString() {
			return "Purchase [name=" + name + ", price=" + price + "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + price;
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
			Purchase other = (Purchase) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (price != other.price)
				return false;
			return true;
		}

		private Payment getEnclosingInstance() {
			return Payment.this;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}
		
	}

}
