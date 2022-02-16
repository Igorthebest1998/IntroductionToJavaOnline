package com.epam.javaIntro.view;

import java.util.List;

import com.epam.javaIntro.entity.Book;

public class BookView {

	private static BookView instance;
		
		private BookView() {}
		
		public static BookView getInstance() {
			if (instance == null) {
				instance = new BookView();
			}
			return instance;
		}
		
		public void print(List<Book> books) {
			System.out.println(books);
		}

}
