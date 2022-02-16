package com.epam.javaIntro;

import java.util.ArrayList;
import java.util.List;

public class District {
	
	private List<Town> towns;
	private int area;
	private String center;

	public District() {
		super();
		towns = new ArrayList<Town>();
	}

	public District(int area, String center) {
		this();
		this.area = area;
		this.center = center;
	}

	public void add(String townName) {
		towns.add(new Town(townName));
	}

	@Override
	public String toString() {
		return "District [towns=" + towns + ", area=" + area + ", center=" + center + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + area;
		result = prime * result + ((center == null) ? 0 : center.hashCode());
		result = prime * result + ((towns == null) ? 0 : towns.hashCode());
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
		District other = (District) obj;
		if (area != other.area)
			return false;
		if (center == null) {
			if (other.center != null)
				return false;
		} else if (!center.equals(other.center))
			return false;
		if (towns == null) {
			if (other.towns != null)
				return false;
		} else if (!towns.equals(other.towns))
			return false;
		return true;
	}

	public List<Town> getTowns() {
		return towns;
	}

	public void setTowns(List<Town> towns) {
		this.towns = towns;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public String getCenter() {
		return center;
	}

	public void setCenter(String center) {
		this.center = center;
	}
	
}
