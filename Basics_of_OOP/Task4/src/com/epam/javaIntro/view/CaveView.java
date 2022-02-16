package com.epam.javaIntro.view;

import java.util.List;

import com.epam.javaIntro.entity.Cave;
import com.epam.javaIntro.entity.Treasure;
import com.epam.javaIntro.logic.CaveLogic;

public class CaveView {

	public static void printTheMostExpensiveTreasure(Cave cave) {
		Treasure treasure = CaveLogic.getTheMostExpensiveTreasure(cave);
		System.out.println("The most expensive treasure: " + treasure);
	}
	
	public static void printTreasuresForGivenAmount(Cave cave, double amount){
		System.out.println("Treasures for given amount:");
		List<Treasure> treasures = CaveLogic.getTreasuresForGivenAmount(cave, amount);
		for (Treasure treasure : treasures) {
			System.out.println(treasure);
		}
	}
	
	public static void printAllTreasures(Cave cave) {
		System.out.println("Treasures:\n");
		for(Treasure treasure : cave.getTreasures()) {
			System.out.println(treasure);
		}
	}
}
