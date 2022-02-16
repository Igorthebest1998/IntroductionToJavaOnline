package com.epam.javaIntro;

import java.util.Arrays;

public class Student {
	
	private String name;
	private int group;
	private int[] marks = new int[5];
	
	public Student(String name, int group, int[] marks) {
		super();
		this.name = name;
		this.group = group;
		this.marks = marks;
	}

	public Student() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", group=" + group + ", marks=" + Arrays.toString(marks) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + group;
		result = prime * result + Arrays.hashCode(marks);
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
		Student other = (Student) obj;
		if (group != other.group)
			return false;
		if (!Arrays.equals(marks, other.marks))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
