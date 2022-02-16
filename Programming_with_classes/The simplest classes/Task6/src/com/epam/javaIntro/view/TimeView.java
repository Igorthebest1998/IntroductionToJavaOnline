package com.epam.javaIntro.view;

import com.epam.javaIntro.entity.Time;

public class TimeView {
	
	private static TimeView instance;
	
	private TimeView() {}
	
	public static TimeView getInstance() {
		if (instance == null) {
			instance = new TimeView();
		}
		return instance;
	}

	public void print(Time time) {
		System.out.printf("%d h %d min %d s \n", time.getHour(), 
				time.getMinute(), time.getSecond());
	}
}
