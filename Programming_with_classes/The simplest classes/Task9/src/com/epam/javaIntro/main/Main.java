package com.epam.javaIntro.main;

import java.util.List;

import com.epam.javaIntro.entity.Book;
import com.epam.javaIntro.entity.BookList;
import com.epam.javaIntro.logic.BookLogic;
import com.epam.javaIntro.view.BookView;

/*
 * 9.Создать класс Book, спецификация которого приведена ниже.
 *   Определить конструкторы, set-и get- методы и метод  toString().
 *   Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
 *   Задать критерии выбора данных и вывести эти данные на консоль.
 *   Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
 *   Найти и вывести:
 *   a) список книг заданного автора;
 *   b) список книг, выпущенных заданным издательством;
 *   c) список книг, выпущенных после заданного года.
 */

public class Main {
	
	public static void main(String[] args) {
		
		BookList books = new BookList();
		Book book1 = new Book(1, "Flower for Algernon", "Daniel Keyes", "World Literature",
				1966, 230, 25, "Hard");
		Book book2 = new Book(2, "Stoic", "Theodore Dreiser", "Exclusive classics", 1947,
				250, 20, "Hard");
		Book book3 = new Book(3, "1984", "George Orwell", "Exclusive classics", 1949, 
				180, 30, "Soft");
		Book book4 = new Book(4, "The godfather", "Mario Puzo", "Pocket book", 1969,
				320, 28, "Soft");
		Book book5 = new Book(5, "Martin Iden", "Jack London", "World literature", 1909,
				185, 23, "Hard");
		Book book6 = new Book(6, "Brave new world", "Aldous Huxley", "Pocket book", 1932,
				240, 25, "Soft");
		Book book7 = new Book(7, "Titan", "Theodore Dreiser", "Exclusive classics", 1914,
				200, 20, "Hard");
		books.addBook(book1);
		books.addBook(book2);
		books.addBook(book3);
		books.addBook(book4);
		books.addBook(book5);
		books.addBook(book6);
		books.addBook(book7);
		BookView view = BookView.getInstance();
		BookLogic logic = BookLogic.getInstance();
		
		List<Book> findBooksByAuthor = logic.findByAuthor(books.getBooks(), 
														"Theodore Dreiser");
		view.print(findBooksByAuthor);
		List<Book> findBooksByPublisher = logic.findByPublisher(books.getBooks(), 
															"Pocket book");
		view.print(findBooksByPublisher);
		List<Book> findBooksAfterYear = logic.findAfterYear(books.getBooks(), 1950);
		view.print(findBooksAfterYear);
	}

}
