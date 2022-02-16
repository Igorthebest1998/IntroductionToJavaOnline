package com.epam.javaIntro.logic;

import java.util.ArrayList;
import java.util.List;

import com.epam.javaIntro.entity.Train;

public class TrainLogic {

	public List<Train> sortByNum(List<Train> trains){
		
		List<Train> sortTrains = new ArrayList<Train>();
		sortTrains.addAll(trains);
		
		for (int i = 0; i < sortTrains.size(); i++)
			for (int j = 0; j < sortTrains.size() - i - 1; j++) {
				if (sortTrains.get(j).getNum() > sortTrains.get(j + 1).getNum()) {
					Train temp = sortTrains.get(j);
					sortTrains.set(j, sortTrains.get(j + 1));
					sortTrains.set(j + 1, temp);					
				}
			}
		
		return sortTrains;
	}
	
	public Train findByNum(int num, List<Train> trains) {
		
		for (Train train : trains) {
			if (train.getNum() == num) {
				return train;
			}
		}
		
		return null;
	}
	
	public List<Train> sortByDestination(List<Train> trains){
		
		List<Train> sortTrains = new ArrayList<Train>();
		sortTrains.addAll(trains);
		
		for (int i = 0; i < sortTrains.size(); i++)
			for (int j = 0; j < sortTrains.size() - i - 1; j++) {
				String destination1 = sortTrains.get(j).getDestination();
				String destination2 = sortTrains.get(j + 1).getDestination();
				int compare = destination1.compareTo(destination2);
				if (compare > 0) {
					Train temp = sortTrains.get(j);
					sortTrains.set(j, sortTrains.get(j + 1));
					sortTrains.set(j + 1, temp);				
				}
				else if (compare == 0) {
					int compareTime = sortTrains.get(j).getTime().hashCode() - 
								sortTrains.get(j + 1).getTime().hashCode();
					if (compareTime > 0) {
						Train temp = sortTrains.get(j);
						sortTrains.set(j, sortTrains.get(j + 1));
						sortTrains.set(j + 1, temp);	
					}
				}
			}
		
		return sortTrains;
	}
	
}
