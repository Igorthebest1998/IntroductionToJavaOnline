package com.epam.javaIntro.logic;

import java.util.ArrayList;
import java.util.List;

import com.epam.javaIntro.entity.Customer;

public class CustomerLogic {

private static CustomerLogic instance;
	
	private CustomerLogic() {}
	
	public static CustomerLogic getInstance() {
		if (instance == null) {
			instance = new CustomerLogic();
		}
		return instance;
	}
	
	public List<Customer> sortByName(List<Customer> customers){
		List<Customer> sortCustomers = new ArrayList<Customer>();
		sortCustomers.addAll(customers);
		
		for (int i = 0; i < sortCustomers.size(); i++)
			for (int j = 0; j < sortCustomers.size() - i - 1; j++) {
				String surnameFirst = sortCustomers.get(j).getSurname();
				String surnameSecond = sortCustomers.get(j + 1).getSurname();
				if (surnameFirst.compareTo(surnameSecond) > 0) {
					Customer temp = sortCustomers.get(j);
					sortCustomers.set(j, sortCustomers.get(j + 1));
					sortCustomers.set(j + 1, temp);
				}
			}
		
		return sortCustomers;
	}
	
	public List<Customer> findByCard(List<Customer> customers, int min, int max){
		List<Customer> findCustomers = new ArrayList<Customer>();
		
		for(Customer customer : customers) {
			if (customer.getCardNum() > min && customer.getCardNum() < max) {
				findCustomers.add(customer);
			}
		}
		
		return findCustomers;
	}
}
