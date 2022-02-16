package com.epam.javaIntro.main;

import com.epam.javaIntro.entity.Cave;
import com.epam.javaIntro.entity.Dragon;
import com.epam.javaIntro.entity.Dragon.DragonStatus;
import com.epam.javaIntro.logic.CaveLogic;
import com.epam.javaIntro.view.Menu;

/*
 *  ������ 4. 
 *	������� ���������� ����������, ��������������� ��������� �����������:  
 *	� ���������� ������ ���� ��������-, � �� ����������-���������������.  
 *	� ������ ����� ������ ����� ���������� ����� �������� � ������������� ������.  
 *	� ������������ ������ ����������� ������ �����, ����� ��� ����� �����.  
 *	� ��� ����������� ������ ���� ������������ ���������� �� ���������� ���� java code convention.  
 *  � ������ ������ ���� �������� ��������� �� �������.  
 *	� ���������� ���� ������ ���� �����������.  
 *  � ��� �������� ������ ����� ������������ �����. 
 *
 *	������ � ��� ���������. ������� ���������, ����������� ������������ �������� � 100 ���������� � ������ 
 *	�������. ����������� ����������� ��������� ��������, ������ ������ �������� �� ��������� ��������� � 
 *	������ �������� �� �������� �����.
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


