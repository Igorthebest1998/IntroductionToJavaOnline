package com.epam.javaIntro.main;

import com.epam.javaIntro.entity.Directory;
import com.epam.javaIntro.entity.TextFile;

/*
 * ������ 1.  
 * ������� ������ ������ ��������� ����, ��������� ������ ����, ����������. ������: �������, �������������, 
 * ������� �� ������� ����������, ���������, �������. 
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
