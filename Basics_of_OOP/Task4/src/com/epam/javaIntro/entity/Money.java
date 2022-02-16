package com.epam.javaIntro.entity;

public class Money extends Treasure{
	
	private MoneyType type;

	public Money() {
		super();
		this.type = MoneyType.UNIDENTIFIED;
	}

	public Money(String name, String description, double price, MoneyType type) {
		super(name, description, price);
		this.type = type;
	}

	@Override
	public String toString() {
		return String.format("Money [type=%s, name=%s, description=%s, price=%.2f]",
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
		Money other = (Money) obj;
		if (type != other.type)
			return false;
		return true;
	}

	public MoneyType getType() {
		return type;
	}

	public void setType(MoneyType type) {
		this.type = type;
	}

	public static enum MoneyType{
		COIN("Монета"),
		BANK_NOTE("Банкнота"),
		UNIDENTIFIED("Неопознано");
		
		private final String value;
		
		private MoneyType(String value) {
			this.value = value;
		}
		
		public String getValue() {
			return value;
		}
	}
	
}
