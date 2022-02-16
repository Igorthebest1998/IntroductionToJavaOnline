package com.epam.javaIntro.entity;

public class Jewelry extends Treasure {

	private JewelryType type;
	
	public Jewelry() {
		super();
		this.type = JewelryType.UNIDENTIFIED;
	}

	public Jewelry(String name, String description, double price, JewelryType type) {
		super(name, description, price);
		this.type = type;
	}

	@Override
	public String toString() {
		return String.format("Jewelry [type=%s, name=%s, description=%s, price=%.2f]",
				type, super.getName(), super.getDescription(), super.getPrice());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jewelry other = (Jewelry) obj;
		if (type != other.type)
			return false;
		return true;
	}

	public JewelryType getType() {
		return type;
	}

	public void setType(JewelryType type) {
		this.type = type;
	}

	public static enum JewelryType{
		EARRINGS("Серьги"),
		CHAIN("Цепочка"),
		BRACELET("Браслет"),
		UNIDENTIFIED("Неопознано");
		
		private final String value;
		
		private JewelryType(String value) {
			this.value = value;
		}
		
		public String getValue() {
			return value;
		}
	}
}
