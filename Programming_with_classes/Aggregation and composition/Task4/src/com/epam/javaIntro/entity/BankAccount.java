package com.epam.javaIntro.entity;

public class BankAccount implements Comparable<BankAccount>{
	
	private int id;
	private int sum;
	private boolean isBlock;
	
	public BankAccount(int id, int sum, boolean isBlock) {
		super();
		this.id = id;
		this.sum = sum;
		this.isBlock = isBlock;
	}

	public BankAccount() {
		this(0, 0, true);
	}

	@Override
	public String toString() {
		return "BankAccount [id=" + id + ", sum=" + sum + ", isBlock=" + isBlock + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + (isBlock ? 1231 : 1237);
		result = prime * result + sum;
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
		BankAccount other = (BankAccount) obj;
		if (id != other.id)
			return false;
		if (isBlock != other.isBlock)
			return false;
		if (sum != other.sum)
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public boolean isBlock() {
		return isBlock;
	}

	public void setBlock(boolean isBlock) {
		this.isBlock = isBlock;
	}

	public int compareTo(BankAccount account) {
		return this.id - account.id;
	}

}
