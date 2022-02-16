package com.epam.javaIntro.logic;

import com.epam.javaIntro.entity.Book;
import com.epam.javaIntro.input.Input;

public class MailLogic {

	public static void notifyAllAboutUpdate(Book book) {
		System.out.printf("Messages were sent: %s\n", book.getName());
	}
	
	public static void suggestBook() {
		System.out.println("Enter name book: ");
		String bookName = Input.inputLine();
		System.out.printf("Message was sent: %s\n", bookName);
	}
}
