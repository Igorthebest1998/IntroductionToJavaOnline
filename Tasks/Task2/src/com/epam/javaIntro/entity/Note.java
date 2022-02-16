package com.epam.javaIntro.entity;

import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Note implements Comparable<Note> {
	
	private String subject;
	private String createDate;
	private String email;
	private String message;
	
	public Note() {
		super();
	}

	public Note(String subject, String createDate, String email, String message) {
		super();
		setSubject(subject);
		setCreateDate(createDate);
		setEmail(email);
		setMessage(message);
	}

	@Override
	public String toString() {
		return "Note [subject=" + subject + ", createDate=" + createDate + ", email=" + email + ", message=" + message
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createDate == null) ? 0 : createDate.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result + ((subject == null) ? 0 : subject.hashCode());
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
		Note other = (Note) obj;
		if (createDate == null) {
			if (other.createDate != null)
				return false;
		} else if (!createDate.equals(other.createDate))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (subject == null) {
			if (other.subject != null)
				return false;
		} else if (!subject.equals(other.subject))
			return false;
		return true;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		Pattern pattern = Pattern.compile("(0[1-9]|[12][0-9]|3[01])[-//.](0[1-9]|1[012])"
				+ "[-//.](19|20)\\d{2}");
		Matcher matcher = pattern.matcher(createDate);
		if (matcher.matches()) {
			this.createDate = createDate;
		}
		this.createDate = "01.01.1980";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email.matches(".+@mail.ru$")) {
			this.email = email;
		} else {
			this.email = "";
		}
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public int compareTo(Note note) {
		return this.subject.compareTo(note.getSubject());
	}

}
