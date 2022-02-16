package com.epam.javaIntro.main;

import java.util.List;

import com.epam.javaIntro.entity.Depo;
import com.epam.javaIntro.entity.Time;
import com.epam.javaIntro.entity.Train;
import com.epam.javaIntro.logic.TrainLogic;
import com.epam.javaIntro.view.TrainView;

/*
 * 4.Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
 *   Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам поездов.
 *   Добавьте возможность вывода информации о поезде, номер которого введен пользователем. 
 *   Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения должны быть 
 *   упорядочены по времени отправления.
 */

public class Main {
	
	public static void main(String[] args) {
		
		Depo trains = new Depo();
		trains.addTrain(new Train("Gomel", 123, new Time(12, 0)));
		trains.addTrain(new Train("Moscow", 45, new Time(11, 45)));
		trains.addTrain(new Train("Moscow", 1, new Time(14, 20)));
		trains.addTrain(new Train("Kiev", 5, new Time(9, 0)));
		trains.addTrain(new Train("London", 13, new Time(17, 30)));
		
		TrainLogic logic = new TrainLogic();
		TrainView view = new TrainView();
		
		List<Train> sortTrains = logic.sortByNum(trains.getTrains());
		view.print(sortTrains);
		sortTrains = logic.sortByDestination(trains.getTrains());
		view.print(sortTrains);
		Train train = logic.findByNum(13, sortTrains);
		view.print(train);
	}

}
