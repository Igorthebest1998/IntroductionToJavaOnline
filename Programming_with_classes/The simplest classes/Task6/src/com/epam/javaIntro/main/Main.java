package com.epam.javaIntro.main;

import com.epam.javaIntro.entity.Time;
import com.epam.javaIntro.logic.TimeLogic;
import com.epam.javaIntro.view.TimeView;

/*
 * 6.��������� �������� ������ ��� ������������� �������.
 *   ������������ ����������� ��������� ������� � ��������� ��� ��������� ����� (���, ������, �������)
 *   � ��������� ������������ �������� ��������. � ������ ������������  �������� ����� ���� 
 *   ���������������  �  ��������  0.  �������  ������  ���������  ������� �� �������� ���������� �����, ����� � ������.
 */

public class Main {
	
	public static void main(String[] args) {
		
		Time time = new Time();
		TimeView view = TimeView.getInstance();
		TimeLogic logic = TimeLogic.getInstance();
		
		view.print(time);
		logic.changeHour(3, time);
		logic.changeMinute(78, time);
		logic.changeSecond(1300, time);
		view.print(time);
	}

}
