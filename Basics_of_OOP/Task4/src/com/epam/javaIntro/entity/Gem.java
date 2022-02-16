package com.epam.javaIntro.entity;

public class Gem extends Treasure {

	private GemType type;
	
	public Gem() {
		super();
		this.type = GemType.UNIDENTIFIED;
	}

	public Gem(String name, String description, double price, GemType type) {
		super(name, description, price);
		this.type = type;
	}

	@Override
	public String toString() {
		return String.format("Gem [type=%s, name=%s, description=%s, price=%.2f]",
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
		Gem other = (Gem) obj;
		if (type != other.type)
			return false;
		return true;
	}

	public GemType getType() {
		return type;
	}

	public void setType(GemType type) {
		this.type = type;
	}

	public static enum GemType{
		DIAMOND("Алмаз"),
		EMERALD("Изумруд"),
		NEPHRITIS("Нефрит"),
		UNIDENTIFIED("Неопознано");
		
		private final String value;
		
		private GemType(String value) {
			this.value = value;
		}
		
		public String getValue() {
			return value;
		}
	}
}
