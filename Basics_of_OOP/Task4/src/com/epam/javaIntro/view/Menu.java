package com.epam.javaIntro.view;

import java.util.Scanner;

import com.epam.javaIntro.entity.Cave;
import com.epam.javaIntro.logic.CaveLogic;
import com.epam.javaIntro.main.Main;

public class Menu {
	
	public void startMenu(Cave cave) {
		int choise;
		boolean isStopped = false;
		printOptions();
		while (!isStopped) {
			System.out.println("Enter number: ");
			choise = makeChoice();
			isStopped = processingOperation(cave, choise);
		}
	}

	 private void printOptions() {
	        String menuText = "Dragon and treasures:\n" 
	        				+ "1 - Show all treasures;\n" 
	        				+ "2 - Show the most expensive treasure;\n" 
	        				+ "3 - Show treatures for given amount;\n" 
	        				+ "4 - Exit.";
	        System.out.println(menuText);
	    }
	    
	    public int makeChoice() {
	        int choice;
	        Scanner scanner = new Scanner(System.in);
	        try {
	            choice = Integer.parseInt(scanner.nextLine());
	            if (choice > 4 || choice < 1) {
	                System.out.println("Option not exist, repeat enter\n");
	                printOptions();
	            } else {
	                return choice;
	            }
	        } catch (NumberFormatException e) {
	            System.out.println("Incorrect value, repeat enter\n");
	            printOptions();
	        }
	        return -1;
	    }
	    
	    private boolean processingOperation(Cave cave, int choice) {
	    	Scanner scanner = new Scanner(System.in);
	        switch (choice){
	            case 1:
	                CaveView.printAllTreasures(cave);
	                break;
	            case 2:	                
	                CaveView.printTheMostExpensiveTreasure(cave);
	                break;
	            case 3:
	            	System.out.println("Enter amount: ");
	                double value;
	                try {
	                    value = Double.parseDouble(scanner.nextLine());
	                    if (value < 0) {
	                        System.out.println("Incorrect value, repeat enter\n");
	                    } else {
	                    	CaveView.printTreasuresForGivenAmount(cave, value);
	                    }
	                } catch (NumberFormatException e) {
	                    System.out.println("Incorrect value\n");
	                }
	                break;
	            case 4:
	                System.out.println("Good bye.\n");
	                return true;
	        }
	        return false;
	    }
	
}
