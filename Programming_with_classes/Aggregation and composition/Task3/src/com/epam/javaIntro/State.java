package com.epam.javaIntro;

import java.util.ArrayList;
import java.util.List;

public class State {
	
	private String capital;
	private List<Region> regions;
	
	public State(String capital) {
		this();
		this.capital = capital;
	}
	
	public State() {
		super();
		regions = new ArrayList<Region>();
	}

	public int getArea() {
		int area = 0;
		for (Region region : regions) {
			area += region.getArea();
		}
		return area;
	}
	
	public void printCapital() {
		System.out.println(capital);
	}
	
	public int getCountRegions() {
		return regions.size();
	}
	
	public String getRegionCenters() {
		String centers = "";
		for (Region region : regions) {
			centers += region.getCenter() + " ";
		}
		return centers;
	}
	
	public void add(Region region) {
		regions.add(region);
	}

	@Override
	public String toString() {
		return "State [capital=" + capital + ", regions=" + regions + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((capital == null) ? 0 : capital.hashCode());
		result = prime * result + ((regions == null) ? 0 : regions.hashCode());
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
		State other = (State) obj;
		if (capital == null) {
			if (other.capital != null)
				return false;
		} else if (!capital.equals(other.capital))
			return false;
		if (regions == null) {
			if (other.regions != null)
				return false;
		} else if (!regions.equals(other.regions))
			return false;
		return true;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public List<Region> getRegions() {
		return regions;
	}

	public void setRegions(List<Region> regions) {
		this.regions = regions;
	}
	
}
