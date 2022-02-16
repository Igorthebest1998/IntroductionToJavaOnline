package com.epam.javaIntro;

import java.util.ArrayList;
import java.util.List;

/*
 * 1.Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на 
 *	 консоль текст, заголовок текста.  
 */

public class Main {
	
	public static void main(String[] args) {
		
		String story = "Дядя Семён ехал из города домой. С ним была собака Жучка, "
				+ "Вдруг из леса выскочили волки. Жучка испугалась и прыгнула в сани. "
				+ "У дяди Семёна была хорошая лошадь. Она тоже испугалась и быстро "
				+ "помчалась по дороге. Деревня была близко. Показались огни в окнах.";
		
		Text text = new Text("Волки", story);
		Sentence sentenceFirst = new Sentence("Волки отстали.\r\n");
		text.addSentence(sentenceFirst);
		
		List<Word> words = new ArrayList<Word>();
		words.add(new Word("Умная"));
		words.add(new Word("лошадь"));
		words.add(new Word("спасла"));
		words.add(new Word("дядю"));
		words.add(new Word("Семена"));
		words.add(new Word("и"));
		words.add(new Word("Жучку"));
		
		Sentence sentenceSecond = new Sentence(words, '.');
		
		text.addSentence(sentenceSecond);
		
		text.printTitle();
		text.printText();
	}

}
