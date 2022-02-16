package com.epam.javaIntro.view;

import java.util.List;

import com.epam.javaIntro.entity.Book;
import com.epam.javaIntro.entity.Catalog;
import com.epam.javaIntro.entity.User;
import com.epam.javaIntro.entity.User.UserType;
import com.epam.javaIntro.input.Input;
import com.epam.javaIntro.logic.CatalogLogic;
import com.epam.javaIntro.logic.UserLogic;
import com.epam.javaIntro.storage.FileStorage;

public class Menu {
	
	private static Catalog catalog;

	public static void start() {
		System.out.println("Welcome to the library!");
		if (entrance()) {
			System.out.println("Login completed successfully");
		}
		while (true) {
			UserType userType = catalog.getUser().getUserType();
			System.out.println(getMainOptions(userType));
			int option = Input.checkInputChoice(userType);
			if (option != 0) {
				performOperation(option);
			} else {
				System.out.println("Good bye.");
				return;
			}
		}
	}
	
	private static boolean entrance() {
		User user = null;
		while (user == null) {
			System.out.println("Enter login: ");
			String login = Input.inputLine();
			System.out.println("Enter password: ");
			String password = Input.inputLine();
			user = UserLogic.checkUser(login, password);
			if (user == null) {
				System.out.println("Invalid login or password ");
			}
		}
		List<Book> books = FileStorage.loadBooks();
		catalog = new Catalog(books, user);
		return true;
	}
	
	private static String getMainOptions(UserType userType) {
        StringBuilder sb = new StringBuilder();
        sb.append("\nOptions:\n").append("1. Show books.\n");
        sb.append("2. Find books.\n");
        if(userType == UserType.ADMIN) {
            sb.append("3. Add book.\n");
            sb.append("4. Add user.\n");
        } else {
            sb.append("3. Send new book to admin.\n");
        }
        sb.append("5. Change user\n");
        sb.append("0. Exit\n");
        return sb.toString();
    }
	
	private static void performOperation(int option) {
        switch (option) {
            case 1:
                CatalogView.printBooks(catalog.getBooks());
                break;
            case 2:
                CatalogLogic.findBook(catalog);
                break;
            case 3:
                if (catalog.getUser().getUserType() == UserType.ADMIN) {
                    CatalogLogic.createBook(catalog);
                }
                break;
            case 4:               
                UserLogic.addUser();
                System.out.println("New user was added.");                
                break;             
        }
	}
}
