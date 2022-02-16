package com.epam.javaIntro.array;

/*
 * 1.Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
 */

public class Task1 {
	
	public static void main(String[] args) {
		
		String[] names = new String[] {
				
			"firstName", "secondName", "thirdName", "fourthName", "fifthName"
		};
		
		String[] snakeCase = new String[names.length];
		for (int i = 0; i < names.length; i++) {
			snakeCase[i] = "";
			for (int j = 0; j < names[i].length(); j++) {
				char letter = names[i].toCharArray()[j];
				if (Character.isUpperCase(letter)) {
					snakeCase[i] += '_';
					snakeCase[i] += Character.toLowerCase(letter);
				}
				else snakeCase[i] += letter;
			}
		}
		
		for(String i : snakeCase) {
			System.out.println(i);
		}
		
	}

}
