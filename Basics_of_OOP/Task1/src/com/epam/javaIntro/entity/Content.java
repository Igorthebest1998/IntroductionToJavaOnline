package com.epam.javaIntro.entity;

public class Content {
	
	private String text;

	public Content() {
		super();
	}

	public Content(String text) {
		super();
		this.text = text;
	}

	@Override
	public String toString() {
		return "Content [text=" + text + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((text == null) ? 0 : text.hashCode());
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
		Content other = (Content) obj;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void addText(String text) {
		this.text += " " + text;
	}
	
	public void deleteText() {
		this.text = "";
	}
	
}
