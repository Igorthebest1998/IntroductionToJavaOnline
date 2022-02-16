package com.epam.javaIntro.view;

import java.util.List;

import com.epam.javaIntro.entity.Train;

public class TrainView {
	
	public void print(Train train) {
		System.out.println(train);
	}
	
	public void print(List<Train> trains) {
		System.out.println(trains);
	}

}
