package com.epam.javaIntro.logic;

import java.util.List;

import com.epam.javaIntro.entity.User;
import com.epam.javaIntro.entity.User.UserType;
import com.epam.javaIntro.input.Input;
import com.epam.javaIntro.storage.FileStorage;

public class UserLogic {
	
	private static List<User> users = FileStorage.loadUsers();
	
	public static List<User> getUsers(){
		return users;
	}
	
	public static boolean isExist(String login) {
		for (User user : users) {
			if (user.getLogin().equals(login)) {
				return true;
			}
		}
		return false;
	}
	
	public static User checkUser(String login, String password) {
		User tempUser = new User(0, "", login, password, "", UserType.UNIDENTIFIED, true);
		for (User user : users) {
			if (user.getLogin().equals(tempUser.getLogin()) && 
					(user.getPassword() == tempUser.getPassword())){
				return user;
			}
		}
		return null;
	}
	
	public static boolean addUser() {
		System.out.println("Enter login: ");
		String login = Input.inputLine();
		if (isExist(login)) {
			System.out.println("This user exist");
			return false;
		}
		System.out.println("Enter password: ");
		String password = Input.inputLine();
		System.out.println("Enter name: ");
		String name = Input.inputLine();
		System.out.println("Enter your email: ");
		String email = Input.inputLine();
		User user = new User(users.size(), name, login, password, email, UserType.USER, true);
		users.add(user);
		FileStorage.saveUsers(users);
		return true;
	}
}
