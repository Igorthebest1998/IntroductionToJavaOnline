package com.epam.javaIntro.main;

import com.epam.javaIntro.entity.Cave;
import com.epam.javaIntro.entity.Dragon;
import com.epam.javaIntro.entity.Dragon.DragonStatus;
import com.epam.javaIntro.logic.CaveLogic;
import com.epam.javaIntro.view.Menu;

/*
 *  «адача 4. 
 *	—оздать консольное приложение, удовлетвор€ющее следующим требовани€м:  
 *	Х ѕриложение должно быть объектно-, а не процедурно-ориентированным.  
 *	Х  аждый класс должен иметь отражающее смысл название и информативный состав.  
 *	Х Ќаследование должно примен€тьс€ только тогда, когда это имеет смысл.  
 *	Х ѕри кодировании должны быть использованы соглашени€ об оформлении кода java code convention.  
 *  Х  лассы должны быть грамотно разложены по пакетам.  
 *	Х  онсольное меню должно быть минимальным.  
 *  Х ƒл€ хранени€ данных можно использовать файлы. 
 *
 *	ƒракон и его сокровища. —оздать программу, позвол€ющую обрабатывать сведени€ о 100 сокровищах в пещере 
 *	дракона. –еализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и 
 *	выбора сокровищ на заданную сумму.
 */

public class Main {
	
	public static void main(String[] args) {
		
		Dragon dragon = new Dragon("Dragon", 150, DragonStatus.AWAKE);
		Cave cave = new Cave("Cave", dragon);
		CaveLogic.getTreasuresFromFile(cave);
		Menu menu = new Menu();
		menu.startMenu(cave);
	}
}


