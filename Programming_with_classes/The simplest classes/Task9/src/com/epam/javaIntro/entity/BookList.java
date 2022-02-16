package com.epam.javaIntro.entity;

import java.util.ArrayList;
import java.util.List;

public class BookList {
	
	private List<Book> books;

	public BookList() {
		super();
		books = new ArrayList<Book>();
	}

	@Override
	public String toString() {
		return "BookList [books=" + books + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((books == null) ? 0 : books.hashCode());
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
		BookList other = (BookList) obj;
		if (books == null) {
			if (other.books != null)
				return false;
		} else if (!books.equals(other.books))
			return false;
		return true;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void addBook(Book book) {
		this.books.add(book);
	}	

}
