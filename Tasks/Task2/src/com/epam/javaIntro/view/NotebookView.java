package com.epam.javaIntro.view;

import java.util.List;

import com.epam.javaIntro.entity.Note;

public class NotebookView {

	public static void printNotes(List<Note> notes) {
		for(Note note : notes) {
			System.out.println(note);
		}
	}
}
