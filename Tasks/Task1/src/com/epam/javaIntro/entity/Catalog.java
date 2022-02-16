package com.epam.javaIntro.entity;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

	private List<Book> books;
	private User user;
	
	public Catalog() {
		super();
		books = new ArrayList<Book>();
	}

	public Catalog(List<Book> books, User user) {
		super();
		this.books = books;
		this.user = user;
	}

	@Override
	public String toString() {
		return "Catalog [books=" + books + ", user=" + user + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((books == null) ? 0 : books.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		Catalog other = (Catalog) obj;
		if (books == null) {
			if (other.books != null)
				return false;
		} else if (!books.equals(other.books))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void addBook(Book book) {
		books.add(book);
	}
}
