package com.epam.javaIntro.main;

import com.epam.javaIntro.entity.Client;
import com.epam.javaIntro.entity.FoodType;
import com.epam.javaIntro.entity.TouristAgency;
import com.epam.javaIntro.entity.TransportType;
import com.epam.javaIntro.entity.Voucher;
import com.epam.javaIntro.entity.VoucherType;
import com.epam.javaIntro.view.TouristAgencyView;

/*
 * 5.������������� �������. ������������ ����� ����������� ������� �� ������ �������������
 *   ������� ���������� ���� (�����, ���������, �������, ������, ����� � �. �.) ��� ������������ ������.
 *   ��������� ����������� ������ ����������, ������� � ����� ����. ����������� ����� � ���������� �������.
 */

public class Main {
	
	public static void main(String[] args) {
		
		TouristAgency agency = new TouristAgency("Agency");
		agency.addVoucher(new Voucher("Belarus", 24, 300, VoucherType.EXCURSION, 
				TransportType.BUS, FoodType.NOT_INCLUDET));
		agency.addVoucher(new Voucher("Russia", 12, 500, VoucherType.VACATION,
				TransportType.BUS, FoodType.ULTRA_ALL_INCLUSIVE));
		agency.addVoucher(new Voucher("Britain", 7, 400, VoucherType.SHOPPING,
				TransportType.PLANE, FoodType.NOT_INCLUDET));
		agency.addVoucher(new Voucher("Japan", 14, 800, VoucherType.CRUISE,
				TransportType.SHIP, FoodType.ALL_INCLUSIVE));
		agency.addVoucher(new Voucher("China", 28, 700, VoucherType.TREATMENT,
				TransportType.TRAIN, FoodType.ULTRA_ALL_INCLUSIVE));

		Client client = new Client("Ivanov", "Andrey");
		
		TouristAgencyView view = new TouristAgencyView();
		view.addClientWithChoices(agency, client);
	}

}
