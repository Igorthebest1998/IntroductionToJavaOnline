package com.epam.javaIntro;

import java.util.ArrayList;
import java.util.List;

/*
 * 1.������� ������ ������ �����, ��������� ������ �����������, �����. ������: ��������� �����, ������� �� 
 *	 ������� �����, ��������� ������.  
 */

public class Main {
	
	public static void main(String[] args) {
		
		String story = "���� ���� ���� �� ������ �����. � ��� ���� ������ �����, "
				+ "����� �� ���� ��������� �����. ����� ���������� � �������� � ����. "
				+ "� ���� ����� ���� ������� ������. ��� ���� ���������� � ������ "
				+ "��������� �� ������. ������� ���� ������. ���������� ���� � �����.";
		
		Text text = new Text("�����", story);
		Sentence sentenceFirst = new Sentence("����� �������.\r\n");
		text.addSentence(sentenceFirst);
		
		List<Word> words = new ArrayList<Word>();
		words.add(new Word("�����"));
		words.add(new Word("������"));
		words.add(new Word("������"));
		words.add(new Word("����"));
		words.add(new Word("������"));
		words.add(new Word("�"));
		words.add(new Word("�����"));
		
		Sentence sentenceSecond = new Sentence(words, '.');
		
		text.addSentence(sentenceSecond);
		
		text.printTitle();
		text.printText();
	}

}
