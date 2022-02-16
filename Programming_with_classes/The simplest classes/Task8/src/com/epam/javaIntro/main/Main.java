package com.epam.javaIntro.main;

import java.util.List;

import com.epam.javaIntro.entity.Customer;
import com.epam.javaIntro.entity.CustomerList;
import com.epam.javaIntro.logic.CustomerLogic;
import com.epam.javaIntro.view.CustomerView;

/*
 * 8.������� ����� Customer, ������������ �������� ��������� ����.
 *   ���������� ������������, set- � get- ������ � ����� toString().
 *   ������� ������ �����, ������������ ������ ���� Customer,
 *   � ����������� �������������� � ��������. ������ ��������
 *   ������ ������ � ������� ��� ������ �� �������. 
 *   
 *   ����� Customer: id, �������, ���, ��������, �����, ����� ��������� ��������, ����� ����������� �����. 
 *   ����� � �������: 
 *   a) ������ ����������� � ���������� �������; 
 *   b) ������ �����������, � ������� ����� ��������� �������� ��������� � �������� ���������
 */

public class Main {
	
	public static void main(String[] args) {
		
		CustomerList customers = new CustomerList();
		Customer customerFirst = new Customer(1,"Ivanov", "Ivan", "Ivanovich",
				"Avenu, 25", 123, 132);
		customers.addCustomer(customerFirst);
		Customer customerSecond = new Customer(2, "Petrov", "Oleg", "Nikitich",
				"Street, 34", 45, 321);
		customers.addCustomer(customerSecond);
		Customer customerThird = new Customer(3, "Sidorov", "Igor", "Anatolievich", 
				"Stree, 48", 76, 234);
		customers.addCustomer(customerThird);
		Customer customerFourth = new Customer(4, "Andreev", "Leonid", "Fedorovoch", 
				"Avenu, 2", 92, 21323);
		customers.addCustomer(customerFourth);
		CustomerView view = CustomerView.getInstance();
		CustomerLogic logic = CustomerLogic.getInstance();
		
		List<Customer> sortCustomers = logic.sortByName(customers.getCustomers());
		view.print(sortCustomers);
		List<Customer> customersInInterval = logic.findByCard(customers.getCustomers(),
																				80, 130);
		view.print(customersInInterval);
	}

}
