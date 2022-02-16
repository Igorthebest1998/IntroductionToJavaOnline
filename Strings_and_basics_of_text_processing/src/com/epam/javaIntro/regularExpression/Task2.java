package com.epam.javaIntro.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 2.Дана строка, содержащая следующий текст (xml-документ):
 *   <notes>
 *      <note id = "1">
 *         <to>Вася</to>
 *         <from>Света</from>
 *         <heading>Напоминание</heading>
 *         <body>Позвони мне завтра!</body>
 *      </note>
 *      <note id = "2">
 *          <to>Петя</to>
 *          <from>Маша</from>
 *          <heading>Важное напоминание</heading>
 *          <body/>
 *      </note>
 *   </notes>
 *   Напишите анализатор, позволяющий последовательно возвращать содержимое узлов
 *   xml-документа и его тип (открывающий тег, закрывающий тег, содержимое тега,
 *   тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи нельзя.
 */

public class Task2 {
	
	public static void main (String[] args) {
		
		String xml = 
			"<note>\n"
			+ " <to>Петя</to>\n"
			+ " <from>Марина</from>\n"
			+ " <heading>Напоминание</heading>\n"
			+ " <body>Не забудь купить молока!</body>\n"
			+ " </note>";
		
		System.out.println(Parser(xml));
	}
	
	public static String Parser(String XML) {
		
		StringBuilder strBuilder = new StringBuilder();
		
		String OPEN_REGEX = new String("<\\w.+?>");
		String CLOSE_REGEX = new String("</\\w+>");
		String BODY_REGEX = new String(">.+?<");
		String EMPTY_REGEX = new String("<\\w.+?/>");
	
		Pattern pOpen = Pattern.compile(OPEN_REGEX);
		Pattern pClose = Pattern.compile(CLOSE_REGEX);
		Pattern pBody = Pattern.compile(BODY_REGEX);
		Pattern pEmpty = Pattern.compile(EMPTY_REGEX);

		String [] lines = XML.split("\n\\s*"); 

		for (String line : lines) {
			Matcher mOpen = pOpen.matcher(line);
			Matcher mClose = pClose.matcher(line);
			Matcher mBody = pBody.matcher(line);
			Matcher mEmpty = pEmpty.matcher(line);
			if (mEmpty.find()) {
				strBuilder.append(mEmpty.group());
				strBuilder.append(" - пустой тег\n");
			}
			else if (mOpen.find()) {
				strBuilder.append(mOpen.group());
				strBuilder.append(" - открывающий тег\n");
			}
			if (mBody.find()) {
				String content = mBody.group();
				strBuilder.append(content.substring(1, content.length() - 1));
				strBuilder.append(" - содержимое тега\n");
			}
			if (mClose.find()) {
				strBuilder.append(mClose.group());
				strBuilder.append(" - закрывающий тег\n");
			}

		}
		return strBuilder.toString();
	}

}
