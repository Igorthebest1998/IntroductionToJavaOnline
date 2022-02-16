package com.epam.javaIntro.entity;

import java.util.ArrayList;
import java.util.List;

public class Cave {
	
	private String name;
	private Creature owner;
	private List<Treasure> treasures;
	
	public Cave() {
		super();
	}

	public Cave(String name, Creature owner) {
		super();
		this.name = name;
		this.owner = owner;
		this.treasures = new ArrayList<Treasure>();		
	}
	
	public Cave(String name, Creature owner, List<Treasure> treasures) {
		this(name, owner);
		this.treasures = treasures;
	}

	@Override
	public String toString() {
		return "Cave [name=" + name + ", owner=" + owner + ", treasures=" + treasures + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
		result = prime * result + ((treasures == null) ? 0 : treasures.hashCode());
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
		Cave other = (Cave) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (owner == null) {
			if (other.owner != null)
				return false;
		} else if (!owner.equals(other.owner))
			return false;
		if (treasures == null) {
			if (other.treasures != null)
				return false;
		} else if (!treasures.equals(other.treasures))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Creature getOwner() {
		return owner;
	}

	public void setOwner(Creature owner) {
		this.owner = owner;
	}

	public List<Treasure> getTreasures() {
		return treasures;
	}

	public void setTreasures(List<Treasure> treasures) {
		this.treasures = treasures;
	}

	public void addTreasure(Treasure treasure) {
		treasures.add(treasure);
	}
}
