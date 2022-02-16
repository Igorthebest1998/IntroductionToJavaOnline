package com.epam.javaIntro.logic;

import java.util.ArrayList;
import java.util.List;

import com.epam.javaIntro.entity.Book;
import com.epam.javaIntro.entity.Book.BookType;
import com.epam.javaIntro.entity.Catalog;
import com.epam.javaIntro.input.Input;
import com.epam.javaIntro.storage.FileStorage;
import com.epam.javaIntro.view.CatalogView;

public class CatalogLogic {
	
	public static void findBooksByName(String name, Catalog catalog) {
		List<Book> result = new ArrayList<Book>();
		for (Book book : catalog.getBooks()) {
			if (book.getName().equals(name)){
				result.add(book);
			}
		}
		CatalogView.printBooks(result);
	}
	
	public static void findBooksByAuthor(String author, Catalog catalog) {
		List<Book> result = new ArrayList<Book>();
		for (Book book : catalog.getBooks()) {
			if (book.getAuthor().equals(author)){
				result.add(book);
			}
		}
		CatalogView.printBooks(result);
	}

	public static void createBook(Catalog catalog) {
		System.out.println("Enter books name:");
		String name = Input.inputLine();
		System.out.println("Enter books author:");
		String author = Input.inputLine();
		System.out.println("Enter books year:");
		int year = Integer.parseInt(Input.inputLine());
		System.out.println("Enter books type:");
		BookType type = BookType.valueOf(Input.inputLine());
		Book book = new Book(name, author, type, year);
		catalog.addBook(book);
		FileStorage.saveBooks(catalog.getBooks());
		MailLogic.notifyAllAboutUpdate(book);
	}
	
	public static void findBook(Catalog catalog) {
		System.out.println("Enter 1 for find book by author\n"
						 + "Enter 2 for find book by name\n");
		int choise = Input.checkInputChoice(catalog.getUser().getUserType());
		if (choise == 1) {
			System.out.println("Enter author: ");
			String author = Input.inputLine();
			findBooksByAuthor(author, catalog);
		} else if (choise == 2) {
			System.out.println("Enter book name: ");
			String name = Input.inputLine();
			findBooksByName(name, catalog);
		} else {
			System.out.println("Books was not found");
		}
	}
}
