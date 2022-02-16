package com.epam.javaIntro;

public class Wheel {
	
	private String type;
	private int diametr;
	
	public Wheel() {
		super();
	}

	public Wheel(String type, int diametr) {
		super();
		this.type = type;
		this.diametr = diametr;
	}

	@Override
	public String toString() {
		return "Wheel [type=" + type + ", diametr=" + diametr + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + diametr;
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
		Wheel other = (Wheel) obj;
		if (diametr != other.diametr)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getDiametr() {
		return diametr;
	}

	public void setDiametr(int diametr) {
		this.diametr = diametr;
	}
	
	public void exchange (Wheel wheel) {
		this.type = wheel.type;
		this.diametr = wheel.diametr;
	}
	
}
