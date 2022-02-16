package com.epam.javaIntro;

import java.util.ArrayList;
import java.util.List;

public class Region {
	
	private String center;
	private List<District> districts;
	
	public Region(String center) {
		this();
		this.center = center;	
	}
	
	public Region() {
		super();
		districts = new ArrayList<District>();
	}

	public int getArea() {
		int area = 0;
		for (District district : districts) {
			area += district.getArea();
		}
		return area;
	}

	public void add(District district) {
		districts.add(district);
	}

	@Override
	public String toString() {
		return "Region [center=" + center + ", districts=" + districts + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((center == null) ? 0 : center.hashCode());
		result = prime * result + ((districts == null) ? 0 : districts.hashCode());
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
		Region other = (Region) obj;
		if (center == null) {
			if (other.center != null)
				return false;
		} else if (!center.equals(other.center))
			return false;
		if (districts == null) {
			if (other.districts != null)
				return false;
		} else if (!districts.equals(other.districts))
			return false;
		return true;
	}

	public String getCenter() {
		return center;
	}

	public void setCenter(String center) {
		this.center = center;
	}

	public List<District> getDistricts() {
		return districts;
	}

	public void setDistricts(List<District> districts) {
		this.districts = districts;
	}
	
}
