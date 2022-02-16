package com.epam.javaIntro.view;

import java.util.List;

import com.epam.javaIntro.entity.Book;

public class CatalogView {

	public static void printBooks(List<Book> books) {
		int page = 0;
		int booksOfPage = 10;
		int startPage = booksOfPage * page;
		int endPage = startPage + booksOfPage;
		if(endPage > books.size()) {
			endPage = books.size();
		}
		do {
			for (int i = startPage; i < endPage; i++) {
				System.out.println(books.get(i));
			}
			page++;
		} while(endPage < books.size());
	}
	
	public static void printBook(Book book) {
		System.out.printf("\'%s\', %s %d %s\n", book.getName(), book.getAuthor(), 
				book.getPublicationYear(), book.getBookType());
	}
}
