package com.epam.javaIntro.main;

import java.util.List;

import com.epam.javaIntro.entity.Customer;
import com.epam.javaIntro.entity.CustomerList;
import com.epam.javaIntro.logic.CustomerLogic;
import com.epam.javaIntro.view.CustomerView;

/*
 * 8.—оздать класс Customer, спецификаци€ которого приведена ниже.
 *   ќпределить конструкторы, set- и get- методы и метод toString().
 *   —оздать второй класс, агрегирующий массив типа Customer,
 *   с подход€щими конструкторами и методами. «адать критерии
 *   выбора данных и вывести эти данные на консоль. 
 *   
 *    ласс Customer: id, фамили€, им€, отчество, адрес, номер кредитной карточки, номер банковского счета. 
 *   Ќайти и вывести: 
 *   a) список покупателей в алфавитном пор€дке; 
 *   b) список покупателей, у которых номер кредитной карточки находитс€ в заданном интервале
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
