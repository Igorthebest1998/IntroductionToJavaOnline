package com.epam.javaIntro.entity;

public class Letter {
	
	private String recepientEmail;
	private String sendlerEmail;
	private Book book;
	private String message;
	
	public Letter() {
		super();
	}

	public Letter(String recepientEmail, String sendlerEmail, Book book, String message) {
		super();
		this.recepientEmail = recepientEmail;
		this.sendlerEmail = sendlerEmail;
		this.book = book;
		this.message = message;
	}

	@Override
	public String toString() {
		return "Letter [recepientEmail=" + recepientEmail + ", sendlerEmail=" + sendlerEmail + ", book=" + book
				+ ", message=" + message + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((book == null) ? 0 : book.hashCode());
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result + ((recepientEmail == null) ? 0 : recepientEmail.hashCode());
		result = prime * result + ((sendlerEmail == null) ? 0 : sendlerEmail.hashCode());
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
		Letter other = (Letter) obj;
		if (book == null) {
			if (other.book != null)
				return false;
		} else if (!book.equals(other.book))
			return false;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (recepientEmail == null) {
			if (other.recepientEmail != null)
				return false;
		} else if (!recepientEmail.equals(other.recepientEmail))
			return false;
		if (sendlerEmail == null) {
			if (other.sendlerEmail != null)
				return false;
		} else if (!sendlerEmail.equals(other.sendlerEmail))
			return false;
		return true;
	}

	public String getRecepientEmail() {
		return recepientEmail;
	}

	public void setRecepientEmail(String recepientEmail) {
		this.recepientEmail = recepientEmail;
	}

	public String getSendlerEmail() {
		return sendlerEmail;
	}

	public void setSendlerEmail(String sendlerEmail) {
		this.sendlerEmail = sendlerEmail;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
