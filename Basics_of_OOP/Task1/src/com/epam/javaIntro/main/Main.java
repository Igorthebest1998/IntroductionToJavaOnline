package com.epam.javaIntro.main;

import com.epam.javaIntro.entity.Directory;
import com.epam.javaIntro.entity.TextFile;

/*
 * Задача 1.  
 * Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать, 
 * вывести на консоль содержимое, дополнить, удалить. 
 */

public class Main {
	
	public static void main(String[] args) {
		
		Directory directory = new Directory("myDirectory");
		TextFile file = new TextFile("file", directory,"This is text in File");
		file.printContent();
		file.addContent("Task1");
		file.printContent();
		file.deleteContent();
		file.printContent();
	}

}
