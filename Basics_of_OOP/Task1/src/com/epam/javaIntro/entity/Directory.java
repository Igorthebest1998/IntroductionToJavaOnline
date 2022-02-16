package com.epam.javaIntro.entity;

import java.util.ArrayList;
import java.util.List;

public class Directory {
	
	private String name;
	private List<File> files;
	
	public Directory() {
		super();
		files = new ArrayList<File>();
	}

	public Directory(String name) {
		this();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Directory [name=" + name + ", files=" + files + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((files == null) ? 0 : files.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Directory other = (Directory) obj;
		if (files == null) {
			if (other.files != null)
				return false;
		} else if (!files.equals(other.files))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<File> getFiles() {
		return files;
	}

	public void setFiles(List<File> files) {
		this.files = files;
	}

	public void addFile(File file) {
		files.add(file);
	}
	
}
