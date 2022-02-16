package com.epam.javaIntro.logic;

import com.epam.javaIntro.entity.Time;

public class TimeLogic {
	
	private static TimeLogic instance;
	
	private TimeLogic() {}
	
	public static TimeLogic getInstance() {
		if (instance == null) {
			instance = new TimeLogic();
		}
		return instance;
	}
	
	public void changeHour(int hour, Time time) {
		int tempHour = time.getHour() + hour;
		if (tempHour > 24) {
			time.setHour(tempHour % 24);
		} else {
			time.setHour(tempHour);
		}
	}
	
	public void changeMinute(int minute, Time time) {
		int tempMinute = time.getMinute() + minute;
		if(tempMinute > 60) {
			time.setMinute(tempMinute % 60);
			changeHour(tempMinute / 60, time);
		} else {
			time.setMinute(tempMinute);
		}
	}
	
	public void changeSecond(int second, Time time) {
		int tempSecond = time.getSecond() + second;
		if(tempSecond > 60) {
			time.setSecond(tempSecond % 60);
			changeMinute(tempSecond / 60, time);
		} else {
			time.setSecond(tempSecond);
		}
	}

}
