package com.epam.javaIntro.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.epam.javaIntro.entity.Note;
import com.epam.javaIntro.entity.Notebook;
import com.epam.javaIntro.view.NotebookView;

public class NotebookLogic {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static Note createNote() {
		System.out.println("Enter subject: ");
		String subject = scanner.nextLine();
		System.out.println("Enter date: ");
		String createDate = scanner.nextLine();
		System.out.println("Enter email: ");
		String email = scanner.nextLine();
		System.out.println("Enter message: ");
		String message = scanner.nextLine();
		Note note = new Note(subject, createDate, email, message);
		return note;
	}
	
	public static void findNote(Notebook notebook) {
		List<Note> notes = new ArrayList<Note>();
		System.out.println("Enter 1 for find by subject\n"
						 + "Enter 2 for find by date\n"
						 + "Enter 3 for find by email\n"
						 + "Enter 4 for find by word\n"
						 + "Enter 5 for find by subject and email\n");
		int choise = scanner.nextInt();
		if (choise == 1) {
			System.out.println("Enter subject: ");
			notes = findNotesBySubject(notebook.getNotes(), scanner.nextLine());
		} else if (choise == 2) {
			System.out.println("Enter date: ");
			notes = findNotesByDate(notebook.getNotes(), scanner.nextLine());
		} else if (choise == 3) {
			System.out.println("Enter email: ");
			notes = findNotesByEmail(notebook.getNotes(), scanner.nextLine());
		} else if (choise == 4) {
			System.out.println("Enter word: ");
			notes = findNotesByWordInMessage(notebook.getNotes(), scanner.nextLine());
		} else if (choise == 5) {
			System.out.println("Enter subject: ");
			notes = findNotesBySubject(notebook.getNotes(), scanner.nextLine());
			System.out.println("Enter email: ");
			notes = findNotesByEmail(notes, scanner.nextLine());
		} 
		if (notes.size() == 0) {
			System.out.println("Not found"); 
		} else {
			System.out.println("Founded notes: ");
			NotebookView.printNotes(notes);
		}
	}
	
	private static List<Note> findNotesBySubject(List<Note> notes, String subject) {
		ArrayList<Note> findedNotes = new ArrayList<Note>();
		for (Note note : notes) {
			if (note.getSubject().equals(subject)) {
				findedNotes.add(note);
			}
		}
		return findedNotes;
	}
	
	private static List<Note> findNotesByDate(List<Note> notes, String date) {
		List<Note> findedNotes = new ArrayList<Note>();
		for (Note note : notes) {
			if (note.getCreateDate().equals(date)) {
				findedNotes.add(note);
			}
		}
		sortNotesBySubject(notes);
		return findedNotes;
	}
	
	public static List<Note> findNotesByEmail(List<Note> notes, String email) {
		List<Note> findedNotes = new ArrayList<Note>();
		for (Note note : notes) {
			if (note.getEmail().equals(email)) {
				findedNotes.add(note);
			}
		}
		sortNotesBySubject(notes);
		return findedNotes;
	}
	
	public static List<Note> findNotesByWordInMessage(List<Note> notes, String word) {
		List<Note> findedNotes = new ArrayList<Note>();
		Pattern pattern = Pattern.compile(word);
		for (Note note : notes) {
			Matcher matcher = pattern.matcher(note.getMessage());
			if (matcher.find()) {
				findedNotes.add(note);
			}
		}
		sortNotesBySubject(notes);
		return findedNotes;
	}
	
	private static List<Note> sortNotesBySubject(List<Note> notes) {
		Collections.sort(notes);
		return notes;
	}

}
