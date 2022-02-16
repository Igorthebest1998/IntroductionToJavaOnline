package com.epam.javaIntro.entity;

import java.util.ArrayList;
import java.util.List;

public class Notebook {
	
	private List<Note> notes;

	public Notebook() {
		super();
		notes = new ArrayList<Note>();
	}

	public Notebook(List<Note> notes) {
		super();
		this.notes = notes;
	}

	@Override
	public String toString() {
		return "Notebook [notes=" + notes + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((notes == null) ? 0 : notes.hashCode());
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
		Notebook other = (Notebook) obj;
		if (notes == null) {
			if (other.notes != null)
				return false;
		} else if (!notes.equals(other.notes))
			return false;
		return true;
	}

	public List<Note> getNotes() {
		return notes;
	}

	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}

	public void addNote(Note note) {
		notes.add(note);
	}
}
