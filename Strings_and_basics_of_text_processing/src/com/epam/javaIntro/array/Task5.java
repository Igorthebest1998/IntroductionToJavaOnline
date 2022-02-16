package com.epam.javaIntro.array;

/*
 * 5.Удалить  в  строке  все  лишние  пробелы,  то  есть  серии  подряд  идущих  пробелов  заменить  на  одиночные  пробелы. 
 *   Крайние пробелы в строке удалить. 
 */

public class Task5 {
	
	public static void main(String[] args) {
		
		String text = "  I finished  school and university. My        family is big ";
		String newText = "";
		char[] chars = text.toCharArray();
		
		int startIndex = 0;
		while (chars[startIndex] == ' ') startIndex++;
		
		int endIndex = chars.length - 1;
		while (chars[endIndex] == ' ') endIndex--;
		
		for (int i = startIndex; i < endIndex + 1; i++) {			
			if (!(chars[i] == ' ' && chars[i + 1] == ' ')) newText += chars[i];
			}
		
		System.out.print(newText);
	}

}
