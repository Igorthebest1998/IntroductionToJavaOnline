package com.epam.javaIntro.main;

import com.epam.javaIntro.entity.Calendar;
import com.epam.javaIntro.entity.DateType;

/*
 * Задача 3. 
 * Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о 
 * выходных и праздничных днях.
 */

public class Main {
	
	public static void main(String[] args) {
		Calendar calendar = new Calendar();
		calendar.addDate("03.01.2020", DateType.HOLIDAY);
		calendar.addDate("04.02.2022", DateType.WEEKDAY);
		calendar.addDate("01.10.2021", DateType.WEEKEND);
		calendar.printDates();
	}
	
}
