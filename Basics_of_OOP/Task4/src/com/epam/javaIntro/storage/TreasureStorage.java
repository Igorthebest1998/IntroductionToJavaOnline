package com.epam.javaIntro.storage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.epam.javaIntro.entity.Treasure;
import com.epam.javaIntro.entity.Gem;
import com.epam.javaIntro.entity.Gem.GemType;
import com.epam.javaIntro.entity.Jewelry;
import com.epam.javaIntro.entity.Jewelry.JewelryType;
import com.epam.javaIntro.entity.Money;
import com.epam.javaIntro.entity.Money.MoneyType;

public class TreasureStorage {
	
	private final String SEPARATOR = ",";
	private final String FILE_PATH = "resources\\Treasures.txt";

	public void loadTreasures(List<Treasure> treasures) {
		treasures.clear();

		try(BufferedReader reader = new BufferedReader(new FileReader(new File(FILE_PATH)))){
			String line = "";
			while((line = reader.readLine()) != null) {
				String[] lines = line.split(SEPARATOR);
				Treasure treasure = null;
				if (lines[0].equalsIgnoreCase("Украшение")) {
					if (lines[4].equalsIgnoreCase("Серьги")) {
						treasure = new Jewelry(lines[1], lines[2], Double.parseDouble(lines[3]), JewelryType.EARRINGS);
					}
					else if (lines[4].equalsIgnoreCase("Цепочка")) {
						treasure = new Jewelry(lines[1], lines[2], Double.parseDouble(lines[3]), JewelryType.CHAIN);
					}
					else if (lines[4].equalsIgnoreCase("Браслет")) {
						treasure = new Jewelry(lines[1], lines[2], Double.parseDouble(lines[3]), JewelryType.BRACELET);
					}
				}
				else if (lines[0].equalsIgnoreCase("Деньги")) {
					if (lines[4].equalsIgnoreCase("Монета")) {
						treasure = new Money(lines[1], lines[2], Double.parseDouble(lines[3]), MoneyType.COIN);
					}
					else if (lines[4].equalsIgnoreCase("Банкнота")) {
						treasure = new Money(lines[1], lines[2], Double.parseDouble(lines[3]), MoneyType.BANK_NOTE);
					}
				}
				else if (lines[0].equalsIgnoreCase("Камень")) {
					if (lines[4].equalsIgnoreCase("Алмаз")) {
						treasure = new Gem(lines[1], lines[2], Double.parseDouble(lines[3]), GemType.DIAMOND);
					}
					else if (lines[4].equalsIgnoreCase("Изумруд")) {
						treasure = new Gem(lines[1], lines[2], Double.parseDouble(lines[3]), GemType.EMERALD);
					}
					else if (lines[4].equalsIgnoreCase("Нефрит")) {
						treasure = new Gem(lines[1], lines[2], Double.parseDouble(lines[3]), GemType.NEPHRITIS);
					}
				}
				treasures.add(treasure);
			}
		}
		catch (IOException ex) {
			ex.getMessage();
		}
	}
}
