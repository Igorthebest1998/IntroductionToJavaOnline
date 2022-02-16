package com.epam.javaIntro.entity;

public class TextFile extends File{

	private Content content;

	public TextFile() {
		super();
	}

	public TextFile(String name, Directory directory, String content) {
		super(name, directory);
		this.content = new Content(content);
	}

	@Override
	public String toString() {
		return "TextFile [content=" + content + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((content == null) ? 0 : content.hashCode());
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
		TextFile other = (TextFile) obj;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		return true;
	}

	public Content getContent() {
		return content;
	}

	public void setContent(Content content) {
		this.content = content;
	}
	
	public void addContent(String content) {
		this.content.addText(content);
	}
	
	public void deleteContent() {
		this.content.deleteText();
	}
	
	public void printContent() {
		System.out.println("Content: " + getContent().getText());
	}
}
