package com.epam.javaIntro.entity;

import java.util.ArrayList;
import java.util.List;

public class Calendar {
	
	private List<Date> dates;
	
	public Calendar() {
		dates = new ArrayList<Date>();
	}
	
	@Override
	public String toString() {
		return "Calendar [dates=" + dates + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dates == null) ? 0 : dates.hashCode());
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
		Calendar other = (Calendar) obj;
		if (dates == null) {
			if (other.dates != null)
				return false;
		} else if (!dates.equals(other.dates))
			return false;
		return true;
	}

	public List<Date> getDates() {
		return dates;
	}

	public void setDates(List<Date> dates) {
		this.dates = dates;
	}
	
	public void addDate(String date, DateType type) {
		dates.add(new Date(date, type));
	}
	
	public void printDate(Date date) {
		System.out.println(date.getDate() + " - " + date.getType());
	}
	
	public void printDates() {
		System.out.println(dates);
	}

	private class Date{
		
		private String date;
		private DateType type;
		
		public Date(String date, DateType type) {
			this.date = date;
			this.type = type;
		}
		
		public Date() {}

		@Override
		public String toString() {
			return "Date [date=" + date + ", type=" + type + "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + ((date == null) ? 0 : date.hashCode());
			result = prime * result + ((type == null) ? 0 : type.hashCode());
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
			Date other = (Date) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			if (date == null) {
				if (other.date != null)
					return false;
			} else if (!date.equals(other.date))
				return false;
			if (type != other.type)
				return false;
			return true;
		}

		private Calendar getEnclosingInstance() {
			return Calendar.this;
		}

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public DateType getType() {
			return type;
		}

		public void setType(DateType type) {
			this.type = type;
		}
		
	}

}
