package com.epam.javaIntro.view;

import java.util.Scanner;

import com.epam.javaIntro.entity.Note;
import com.epam.javaIntro.entity.Notebook;
import com.epam.javaIntro.logic.NotebookLogic;
import com.epam.javaIntro.storage.FileStorage;

public class Menu {
	
	private static Notebook notebook;
	
	public static void start() {
		Scanner scanner = new Scanner(System.in);
		notebook = new Notebook();
		notebook.setNotes(FileStorage.loadNotes());
		System.out.println("Welcome to Notebook!");
		while (true) {
			System.out.println(getMainOptions());
			int option = scanner.nextInt();
			if (option != 0) {
				performOperation(option);
			} else {
				System.out.println("Good bye.");
				FileStorage.saveNotes(notebook.getNotes());
				return;
			}
		}
	}
	
	private static String getMainOptions() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nOptions:\n").append("1. Show notes.\n");
        sb.append("2. Find and sort notes.\n");
        sb.append("3. Add note\n");
        sb.append("0. Exit\n");
        return sb.toString();
    }
	
	private static void performOperation(int option) {
        switch (option) {
            case 1:
                NotebookView.printNotes(notebook.getNotes());               
                break;
            case 2:
                NotebookLogic.findNote(notebook);
                break;
            case 3:
            	Note note = NotebookLogic.createNote();
            	notebook.addNote(note);                
                break;
        }
	}

}
