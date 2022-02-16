package com.epam.javaIntro.main;

import java.util.List;

import com.epam.javaIntro.entity.Airline;
import com.epam.javaIntro.entity.AirlineList;
import com.epam.javaIntro.logic.AirlineLogic;
import com.epam.javaIntro.view.AirlineView;

/*
 * 10.������� ����� Airline, ������������ �������� ��������� ����.
 *    ���������� ������������, set-� get- ������ � �����  toString().
 *    ������� ������ �����, ������������ ������ ���� Airline, � ����������� �������������� � ��������.
 *    ������ �������� ������ ������ � ������� ��� ������ �� �������.
 *    Airline: ����� ����������, ����� �����, ��� ��������, ����� ������, ��� ������.
 *    ����� � �������: a) ������ ������ ������������ ������ ����������;
 *    b) ������ ������ ��� ��������� ��� ������; 
 *    c) ������ ������ ��� ��������� ��� ������, ����� ������ ��� ������� ������ ���������.
 */

public class Main {

	public static void main(String[] args) {
		
		AirlineList airlines = new AirlineList();
		Airline airline1 = new Airline("Moscow", 1, "Boeing", "13:00", "Monday, Friday");
		Airline airline2 = new Airline("Minsk", 2, "Airbus", "12:30", "Sunday, Tuesday");
		Airline airline3 = new Airline("Kiev", 3, "Airbus", "18:00", "Saturday, Friday");
		Airline airline4 = new Airline("London", 4, "Boeing", "14:30", "Monday, Saturday");
		Airline airline5 = new Airline("Minsk", 5, "Boeing", "19:00", "Thuesday, Wednesday");
		airlines.addAirline(airline1);
		airlines.addAirline(airline2);
		airlines.addAirline(airline3);
		airlines.addAirline(airline4);
		airlines.addAirline(airline5);
		AirlineLogic logic = AirlineLogic.getInstance();
		AirlineView view = AirlineView.getInstance();
		
		List<Airline> findAirlinesByDestination = 
								logic.findByDestination(airlines.getAirlines(), "Minsk");
		view.print(findAirlinesByDestination);
		List<Airline> findAirlinesByDayOfWeek = 
								logic.findByDayOfWeek(airlines.getAirlines(), "Friday");
		view.print(findAirlinesByDayOfWeek);
		List<Airline> findAirlinesByDayOfWeekAfterTime = 
								logic.findByDayOfWeekAfterTime(airlines.getAirlines(), 
										"Friday", "15:00");
		view.print(findAirlinesByDayOfWeekAfterTime);
	}
	
}
