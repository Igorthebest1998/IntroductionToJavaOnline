package com.epam.javaIntro.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 2.���� ������, ���������� ��������� ����� (xml-��������):
 *   <notes>
 *      <note id = "1">
 *         <to>����</to>
 *         <from>�����</from>
 *         <heading>�����������</heading>
 *         <body>������� ��� ������!</body>
 *      </note>
 *      <note id = "2">
 *          <to>����</to>
 *          <from>����</from>
 *          <heading>������ �����������</heading>
 *          <body/>
 *      </note>
 *   </notes>
 *   �������� ����������, ����������� ��������������� ���������� ���������� �����
 *   xml-��������� � ��� ��� (����������� ���, ����������� ���, ���������� ����,
 *   ��� ��� ����). ������������ �������� ��������� XML ��� ������� ������ ������ ������.
 */

public class Task2 {
	
	public static void main (String[] args) {
		
		String xml = 
			"<note>\n"
			+ " <to>����</to>\n"
			+ " <from>������</from>\n"
			+ " <heading>�����������</heading>\n"
			+ " <body>�� ������ ������ ������!</body>\n"
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
				strBuilder.append(" - ������ ���\n");
			}
			else if (mOpen.find()) {
				strBuilder.append(mOpen.group());
				strBuilder.append(" - ����������� ���\n");
			}
			if (mBody.find()) {
				String content = mBody.group();
				strBuilder.append(content.substring(1, content.length() - 1));
				strBuilder.append(" - ���������� ����\n");
			}
			if (mClose.find()) {
				strBuilder.append(mClose.group());
				strBuilder.append(" - ����������� ���\n");
			}

		}
		return strBuilder.toString();
	}

}
