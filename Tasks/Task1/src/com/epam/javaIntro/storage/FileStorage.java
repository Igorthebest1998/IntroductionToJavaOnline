package com.epam.javaIntro.storage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.epam.javaIntro.entity.Book;
import com.epam.javaIntro.entity.Book.BookType;
import com.epam.javaIntro.entity.User;
import com.epam.javaIntro.entity.User.UserType;

public class FileStorage {

	private static String usersFile = "resources\\Users.txt";
    private static String booksFile = "resources\\Books.txt";
    
    public static List<User> loadUsers() {
    	String line;
        String splitBy = ";";
        List<User> users = new ArrayList<User>();
        try (BufferedReader br = new BufferedReader(new FileReader(usersFile))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(splitBy);
                User user = new User(Integer.parseInt(data[0]), data[1], data[2], data[3],
                		data[4], UserType.valueOf(data[5]), false); 
                users.add(user);
            }
        } catch (IOException ex) {
            ex.getMessage();
        }
        return users;
    }
    
    public static void saveUsers(List<User> users) {
    	try (BufferedWriter bw = new BufferedWriter(new FileWriter(usersFile))) {
            for (User user : users) {
                StringBuilder sb = new StringBuilder();
                sb.append(user.getId());
                sb.append(";");
                sb.append(user.getName());
                sb.append(";");
                sb.append(user.getLogin());
                sb.append(";");
                sb.append(user.getPassword());
                sb.append(";");
                sb.append(user.getEmail());
                sb.append(";");
                sb.append(user.getUserType());
                bw.write(sb.toString());
                bw.newLine();
            }

        } catch (IOException ex) {
            ex.getMessage();
        }
    }
    
    public static ArrayList<Book> loadBooks() {
        String line;
        String splitBy = ";";
        ArrayList<Book> books = new ArrayList<Book>();
        try (BufferedReader br = new BufferedReader(new FileReader(booksFile))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(splitBy);
                Book book = new Book(data[0], data[1], BookType.valueOf(data[2]), 
                		Integer.parseInt(data[3]));
                books.add(book);
            }
        } catch (IOException ex) {
            ex.getMessage();
        }
        return books;
    }
    
    public static void saveBooks(List<Book> books) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(booksFile))) {
            for (Book book : books) {
                StringBuilder sb = new StringBuilder();
                sb.append(book.getName());
                sb.append(";");
                sb.append(book.getAuthor());
                sb.append(";");
                sb.append(book.getBookType());
                sb.append(";");
                sb.append(book.getPublicationYear());
                bw.write(sb.toString());
                bw.newLine();
            }
        } catch (IOException ex) {
            ex.getMessage();
        }
    }
}
