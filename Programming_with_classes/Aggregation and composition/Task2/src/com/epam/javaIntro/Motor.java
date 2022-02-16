package com.epam.javaIntro;

public class Motor {

	private String type;
	private int countCylindres;
	private int volume;
	
	public Motor(String type, int countCylindres, int volume) {
		this.type = type;
		this.countCylindres = countCylindres;
		this.volume = volume;
	}
	
	public Motor() {
		super();
	}

	@Override
	public String toString() {
		return "Motor [type=" + type + ", countCylindres=" + countCylindres + ", volume=" + volume + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + countCylindres;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + volume;
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
		Motor other = (Motor) obj;
		if (countCylindres != other.countCylindres)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (volume != other.volume)
			return false;
		return true;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCountCylindres() {
		return countCylindres;
	}

	public void setCountCylindres(int countCylindres) {
		this.countCylindres = countCylindres;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
}
