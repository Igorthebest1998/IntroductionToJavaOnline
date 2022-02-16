package com.epam.javaIntro.view;

import java.util.Scanner;


import com.epam.javaIntro.entity.Client;
import com.epam.javaIntro.entity.TouristAgency;
import com.epam.javaIntro.entity.Voucher;
import com.epam.javaIntro.logic.TouristAgencyLogic;

public class TouristAgencyView {
	
	public void printVouchers(TouristAgency touristAgency) {
		int start = 1;
		for (Voucher voucher : touristAgency.getVouchers()) {
			System.out.println(start + ". " + voucher);
			start++;
		}
	}

	public void printClients(TouristAgency touristAgency) {
		for (Client client : touristAgency.getClients()) {
			System.out.println(client);
		}
	}
	
	public void addClientWithChoices(TouristAgency touristAgency, Client client) {
		Scanner in = new Scanner(System.in);
		String choise = "";
		System.out.println("Выберите путевку введя соответсвующую ей цифру.\n"
							 + "Чтобы отсортировать список по цене введите \"price\"\n"
							 + "Чтобы отсортировать список по кол-ву дней введите \"days\"\n"
							 + "Чтобы выйти введите \"exit\"\n");
		printVouchers(touristAgency);
		while (!choise.equals("exit")) {
			choise = in.nextLine();
			switch (choise) {
				case "price":
					TouristAgencyLogic logic = new TouristAgencyLogic();
					logic.sortVouchersByPrice(touristAgency);
					printVouchers(touristAgency);
					break;
						
				case "days":
					TouristAgencyLogic logic1 = new TouristAgencyLogic();
					logic1.sortVouchersByCountOfDays(touristAgency);
					printVouchers(touristAgency);
					break;
						
				case "exit":
					break;
						
				default:
					if (Integer.parseInt(choise) > 0 && Integer.parseInt(choise) 
							<= touristAgency.getVouchers().size()) {
						Voucher voucher = touristAgency.getVouchers().get(Integer.parseInt(choise) 
								- 1);
						client.setVoucher(voucher);
						touristAgency.getClients().add(client);
						choise = "exit";
					} else {
						System.out.println("Вы ввели некоректное значение\n");
					}
				}
			}
		in.close();
	}

}
