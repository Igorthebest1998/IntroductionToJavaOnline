package com.epam.javaIntro.regularExpression;

import java.util.Arrays;

/*
 * 1.Cоздать  приложение,  разбирающее  текст  (текст  хранитс€  в  строке)  и  позвол€ющее  выполн€ть  с  текстом  три  различных 
 *	 операции:  отсортировать  абзацы  по  количеству  предложений;  в  каждом  предложении  отсортировать  слова  по  длине; 
 *	 отсортировать лексемы в предложении  по убыванию количества вхождений заданного символа, а в случае равенства Ц по 
 *	 алфавиту.
 */

public class Task1 {
	
	public static void main(String[] args) {
		
		String text = "Every day in elementary school in America begins at 9:20 a m. "
				+ "Children have classes till 3:15 p m. At 12 oТclock children have lunch." 
				+ " Many boys and girls bring their lunch from home. "
				+ "But some of them go for lunch to a school cafeteria."
				+ "    Mrs Bradley prepares school lunches almost every weekday for her "
				+ "two children. Sometimes she gives the children money and "
				+ "they eat in the school cafeteria. But usually the children " 
				+ "prefer to take a lunch from home."
				+ "    This morning Mrs Bradley is making peanut butter and cheese sandwiches, "
				+ "the children's favorite. She puts two bottles of apple juice for "
				+ "the children to drink.";
		
		String sortedText = sortText(text);
		System.out.println(sortedText);
		String sentence = text.split("[//.!?]")[3];
		String sortedSentence = sortSentenceForLong(sentence);
		System.out.println(sortedSentence);
		sortedSentence = sortSentenceForSymbol(sentence, 'a');
		System.out.println(sortedSentence);
	}

	public static String sortText(String text) {
		
		String[] paragraphs = text.split("\s{4}");
		int[] countSentence = new int[paragraphs.length];
		
		for (int i = 0; i < paragraphs.length; i++) {
			String[] sentences = paragraphs[i].split("[\\.!?]\s");
			countSentence[i] = sentences.length;
		}
		
		for (int i = 0; i < countSentence.length; i++) {
			for (int j = 0; j < countSentence.length - i - 1; j++) {
				if (countSentence[j] > countSentence[j + 1]) {
					int temp = countSentence[j];
					countSentence[j] = countSentence[j + 1];
					countSentence[j + 1] = temp;
					String tempString = paragraphs[j];
					paragraphs[j] = paragraphs[j + 1];
					paragraphs[j + 1] = tempString;
				}
			}
		}
		
		return String.join("    ", paragraphs);
	}
	
	public static String sortSentenceForLong(String sentence) {
		
			String[] words = sentence.split(",*\s");
		
			for (int i = 0; i < words.length; i++) {
				for (int j = 0; j < words.length - i - 1; j++) {
					if (words[j].length() > words[j + 1].length()) {
						String temp = words[j];
						words[j] = words[j + 1];
						words[j + 1] = temp;
					}
				}
			}
		
		return String.join(" ", words);
	}
	
	public static String sortSentenceForSymbol (String sentence, char symbol) {
		
		String[] words = sentence.split(",*\s");
		
		for (int i = 0; i < words.length; i++)
			for (int j = 0; j < words.length - i - 1; j++) {
				long countFirst = words[j].chars().filter(ch -> ch == symbol).count();
				long countSecond = words[j + 1].chars().filter(ch -> ch == symbol).count();
				if (countFirst < countSecond) {
					String temp = words[j];
					words[j] = words[j + 1];
					words[j + 1] = temp;
				} else
					if (countFirst == countSecond) {
						String[] temp = {words[j], words[j + 1]};
						Arrays.sort(temp);
						words[j] = temp[0];
						words[j + 1] = temp[1];
					}
			}
		
		return String.join(" ", words);
	}
}
