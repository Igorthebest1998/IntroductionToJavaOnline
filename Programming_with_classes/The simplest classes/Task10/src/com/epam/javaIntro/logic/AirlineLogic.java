package com.epam.javaIntro.logic;

import java.util.ArrayList;
import java.util.List;

import com.epam.javaIntro.entity.Airline;

public class AirlineLogic {
	
	private static AirlineLogic instance;
	
	private AirlineLogic() {}
	
	public static AirlineLogic getInstance() {
		if (instance == null) {
			instance = new AirlineLogic();
		}
		return instance;
	}
	
	public List<Airline> findByDestination(List<Airline> airlines, String destination){
		List<Airline> findAirlines = new ArrayList<Airline>();
		
		for (Airline airline : airlines) {
			if(airline.getDestination().equalsIgnoreCase(destination)) {
				findAirlines.add(airline);
			}
		}
		
		return findAirlines;
	}
	
	public List<Airline> findByDayOfWeek(List<Airline> airlines, String dayOfWeek){
		List<Airline> findAirlines = new ArrayList<Airline>();
		
		for (Airline airline: airlines) {
			if(airline.getDayOfWeek().contains(dayOfWeek)) {
				findAirlines.add(airline);
			}
		}
		
		return findAirlines;
	}
	
	public List<Airline> findByDayOfWeekAfterTime(List<Airline> airlines, String dayOfWeek,
			String time){
		List<Airline> findAirlines = new ArrayList<Airline>();
		
		for (Airline airline : airlines) {
			if (airline.getDayOfWeek().contains(dayOfWeek) && 
					airline.getTime().compareTo(time) > 0) {
				findAirlines.add(airline);
			}
		}
		
		return findAirlines;
	}

}
