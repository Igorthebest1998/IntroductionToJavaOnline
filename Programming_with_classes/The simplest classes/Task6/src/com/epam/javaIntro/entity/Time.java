package com.epam.javaIntro.entity;

public class Time {
	
	private int hour;
	private int minute;
	private int second;
		
	public Time(int hour, int minute, int second) {
		super();
		this.setHour(hour);
		this.setMinute(minute);
		this.setSecond(second);
	}
	
	public Time() {
		this(0, 0, 0);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hour;
		result = prime * result + minute;
		result = prime * result + second;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		if (hour != other.hour)
			return false;
		if (minute != other.minute)
			return false;
		if (second != other.second)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Time [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
	}

	public int getHour() {
		return hour;
	}
	
	public void setHour(int hour) {
		if (hour > 0 && hour < 24) {
			this.hour = hour;
		} else {
			this.hour = 0;
			}
	}
	
	public int getMinute() {
		return minute;
	}
	
	public void setMinute(int minute) {
		if (minute > 0 && minute < 60) {
			this.minute = minute;
		} else {
			this.minute = 0;
		}
	}
	
	public int getSecond() {
		return second;
	}
	
	public void setSecond(int second) {
		if (second > 0 && second < 60) {
			this.second = second;
		} else {
			this.second = 0;
		}
	}	

}
