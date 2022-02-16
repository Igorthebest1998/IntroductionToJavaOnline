package com.epam.javaIntro.input;

import java.util.Scanner;
import java.util.regex.Pattern;

import com.epam.javaIntro.entity.User.UserType;

public class Input {
	
	private static Scanner scanner = new Scanner(System.in);

	public static String inputLine() {
		return scanner.nextLine();
	}
	
	public static int checkInputChoice(UserType userType) {
        Pattern pattern;
        if(userType == UserType.ADMIN) {
            pattern = Pattern.compile("[0-6[9]]");
        } else {
            pattern = Pattern.compile("[0-3[9]]");
        }
        while (!scanner.hasNext(pattern)) {
        	System.out.println("Выбрана несуществующая операция, попробуйте еще раз");
            scanner.nextLine();
        }
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }
}
