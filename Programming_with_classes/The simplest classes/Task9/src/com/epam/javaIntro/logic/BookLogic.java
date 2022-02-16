package com.epam.javaIntro.logic;

import java.util.ArrayList;
import java.util.List;

import com.epam.javaIntro.entity.Book;

public class BookLogic {
	
	private static BookLogic instance;
		
		private BookLogic() {}
		
		public static BookLogic getInstance() {
			if (instance == null) {
				instance = new BookLogic();
			}
			return instance;
		}
		
		public List<Book> findByAuthor(List<Book> books, String author){
			List<Book> findBooks = new ArrayList<Book>();
			
			for (Book book : books) {
				if (book.getAuthor().equalsIgnoreCase(author)) {
					findBooks.add(book);
				}
			}
			
			return findBooks;
		}
		
		public List<Book> findByPublisher(List<Book> books, String publisher){
			List<Book> findBooks = new ArrayList<Book>();
			
			for (Book book : books) {
				if (book.getPublisher().equalsIgnoreCase(publisher)) {
					findBooks.add(book);
				}
			}
			
			return findBooks;
		}
		
		public List<Book> findAfterYear(List<Book> books, int year){
			List<Book> findBooks = new ArrayList<Book>();
			
			for (Book book : books) {
				if (book.getYear() > year) {
					findBooks.add(book);
				}
			}
			
			return findBooks;
		}
	
}
