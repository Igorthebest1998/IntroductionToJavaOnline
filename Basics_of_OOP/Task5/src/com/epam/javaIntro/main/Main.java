package com.epam.javaIntro.main;

import com.epam.javaIntro.builder.FlowerBuilder;
import com.epam.javaIntro.builder.FlowerCompositionBuilder;
import com.epam.javaIntro.builder.WrapBuilder;
import com.epam.javaIntro.entity.Flower;
import com.epam.javaIntro.entity.FlowerComposition;
import com.epam.javaIntro.entity.Wrap;
import com.epam.javaIntro.entity.Wrap.WrapType;
import com.epam.javaIntro.view.FlowerCompositionView;

/*
 *  «адача 5. 
 *	—оздать консольное приложение, удовлетвор€ющее следующим требовани€м:  
 *	Х  орректно спроектируйте и реализуйте предметную область задачи.  
 *	Х ƒл€ создани€ объектов из иерархии классов продумайте возможность использовани€ порождающих шаблонов 
 *    проектировани€. 
 *	Х –еализуйте проверку данных, вводимых пользователем, но не на стороне клиента. 
 *  Х дл€ проверки корректности переданных данных можно применить регул€рные выражени€. 
 *  Х ћеню выбора действи€ пользователем можно не реализовывать, используйте заглушку. 
 *  Х ќсобое условие: переопределите, где необходимо, методы toString(), equals() и hashCode(). 
 *
 *
 *  ¬ариант A. ÷веточна€ композици€. –еализовать приложение, позвол€ющее создавать цветочные композиции 
 *  (объект, представл€ющий собой цветочную композицию). —оставл€ющими цветочной композиции €вл€ютс€ цветы 
 *  и упаковка.
 */

public class Main {
	
	public static void main(String[] args) {
		
		Flower rose = new FlowerBuilder()
				.setName("Rose")
			    .setColor("Red")
			    .setPrice(10)
			    .build();
		
		Flower tulip = new FlowerBuilder()
				.setName("Tulip")
				.setColor("White")
				.setPrice(6)
				.build();
		
		Flower lily = new FlowerBuilder()
				.setName("Lily")
		  		.setColor("Blue")
		  		.setPrice(7)
		  		.build();

		Wrap wrap = new WrapBuilder()
			   .setWrapType(WrapType.PAPER)
			   .setPrice(3)
			   .build();

		FlowerComposition boquet = new FlowerCompositionBuilder()
							  .setWrap(wrap)
							  .addFlower(rose)
							  .addFlower(tulip)
							  .addFlower(lily)
							  .build();

		FlowerCompositionView view = new FlowerCompositionView();
		view.printFlowerComposition(boquet);	
	}	
}

