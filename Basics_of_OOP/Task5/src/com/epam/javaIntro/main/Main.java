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
 *  ������ 5. 
 *	������� ���������� ����������, ��������������� ��������� �����������:  
 *	� ��������� ������������� � ���������� ���������� ������� ������.  
 *	� ��� �������� �������� �� �������� ������� ���������� ����������� ������������� ����������� �������� 
 *    ��������������. 
 *	� ���������� �������� ������, �������� �������������, �� �� �� ������� �������. 
 *  � ��� �������� ������������ ���������� ������ ����� ��������� ���������� ���������. 
 *  � ���� ������ �������� ������������� ����� �� �������������, ����������� ��������. 
 *  � ������ �������: ��������������, ��� ����������, ������ toString(), equals() � hashCode(). 
 *
 *
 *  ������� A. ��������� ����������. ����������� ����������, ����������� ��������� ��������� ���������� 
 *  (������, �������������� ����� ��������� ����������). ������������� ��������� ���������� �������� ����� 
 *  � ��������.
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

