package com.epam.javaIntro.storage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.epam.javaIntro.entity.Note;

public class FileStorage {
	
	private static final String filePath = "resources\\notes.txt";

	public static List<Note> loadNotes(){
		String line = "";
		String splitBy = ",";
		List<Note> notes = new ArrayList<Note>();
		 try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
	            while ((line = br.readLine()) != null) {
	                String[] data = line.split(splitBy);
	                Note note = new Note(data[0], data[1], data[2], data[3]);
	                notes.add(note);
	            }
	        } catch (IOException ex) {
	            ex.getMessage();
	        }
	        return notes;
	}
	
	public static void saveNotes(List<Note> notes) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (Note note : notes) {
                StringBuilder sb = new StringBuilder();
                sb.append(note.getSubject());
                sb.append(",");
                sb.append(note.getCreateDate());
                sb.append(",");
                sb.append(note.getEmail());
                sb.append(",");
                sb.append(note.getMessage());
                bw.write(sb.toString());
                bw.newLine();
            }

        } catch (IOException ex) {
            ex.getMessage();
        }
	}
}
