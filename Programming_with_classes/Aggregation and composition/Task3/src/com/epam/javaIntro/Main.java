package com.epam.javaIntro;

/*
 * 3.Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести
 * на консоль столицу, количество областей, площадь, областные центры.  
 */

public class Main {
	
	public static void main(String[] args) {
		
		District districtFirst = new District(200, "Smolevishi");
		districtFirst.add("Zhodino");
		districtFirst.add("Smolevichi");
		District districtSecond = new District(160, "Minsk");
		districtSecond.add("Minsk");
		districtSecond.add("Borovlyni");
		District districtThird = new District(200, "Brest");
		districtThird.add("Brest");
		districtThird.add("Tarasiki");
		District districtFourth = new District(180, "Baranovichi");
		districtFourth.add("Baranovichi");
		districtFourth.add("Molchad");
		District districtFifth = new District(100, "Mogilev");
		districtFifth.add("Sidorovichi");
		districtFifth.add("Mogilev");
		District districtSixth = new District(120, "Bobruysk");
		districtSixth.add("Vorotyn");
		districtSixth.add("Bobruysk");
		
		Region regionFirst = new Region("Minsk");
		regionFirst.add(districtFirst);
		regionFirst.add(districtSecond);
		Region regionSecond = new Region("Brest");
		regionSecond.add(districtThird);
		regionSecond.add(districtFourth);
		Region regionThird = new Region("Mogilev");
		regionThird.add(districtFifth);
		regionThird.add(districtSixth);
		
		State state = new State("Minsk");
		state.add(regionFirst);
		state.add(regionSecond);
		state.add(regionThird);
		
		state.printCapital();
		System.out.println(state.getCountRegions());
		System.out.println(state.getArea());
		System.out.println(state.getRegionCenters());
	}

}
