package com.epam.javaIntro.entity;

public class Dragon extends Creature{

	private DragonStatus status;

	public Dragon() {
		super();
	}
	
	public Dragon(String name, int age) {
		this(name, age, DragonStatus.UNIDENTIFIED);
	}

	public Dragon(String name, int age, DragonStatus status) {
		super(name, age);
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Dragon [status=" + status + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		Dragon other = (Dragon) obj;
		if (status != other.status)
			return false;
		return true;
	}

	public DragonStatus getStatus() {
		return status;
	}

	public void setStatus(DragonStatus status) {
		this.status = status;
	}

	public static enum DragonStatus{
		SLEEP("Спит"),
		DEAD("Мертв"),
		AWAKE("Бодрствует"),
		HUNT("Охотится"),
		UNIDENTIFIED("Неопознано");
	
		private final String value;
	
		private DragonStatus(String value) {
			this.value = value;
		}
	
		public String getValue() {
			return value;
		}
	}
}
