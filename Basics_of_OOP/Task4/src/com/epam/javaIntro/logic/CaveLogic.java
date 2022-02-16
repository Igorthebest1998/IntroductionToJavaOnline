package com.epam.javaIntro.logic;

import java.util.ArrayList;
import java.util.List;

import com.epam.javaIntro.entity.Cave;
import com.epam.javaIntro.entity.Treasure;
import com.epam.javaIntro.storage.TreasureStorage;

public class CaveLogic {

	public static void getTreasuresFromFile(Cave cave) {
		TreasureStorage storage = new TreasureStorage();
		storage.loadTreasures(cave.getTreasures());
	}
	
	public static Treasure getTheMostExpensiveTreasure(Cave cave) {
		Treasure mostExpensive = cave.getTreasures().get(0);
		for (Treasure treasure : cave.getTreasures()) {
			if (treasure.getPrice() > mostExpensive.getPrice()) {
				mostExpensive = treasure;
			}
		}
		return mostExpensive;
	}
	
	public static List<Treasure> getTreasuresForGivenAmount(Cave cave, double amount) {
		double sum = 0;
		List<Treasure> treasures = new ArrayList<Treasure>();
		for (Treasure treasure : cave.getTreasures()) {
			if (sum + treasure.getPrice() <= amount) {
				treasures.add(treasure);
				sum += treasure.getPrice();
			}
		}
		return treasures;
	}
}
