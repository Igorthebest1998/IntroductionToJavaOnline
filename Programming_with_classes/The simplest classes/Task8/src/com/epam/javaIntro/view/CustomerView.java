package com.epam.javaIntro.view;

import java.util.List;

import com.epam.javaIntro.entity.Customer;

public class CustomerView {

private static CustomerView instance;
	
	private CustomerView() {}
	
	public static CustomerView getInstance() {
		if (instance == null) {
			instance = new CustomerView();
		}
		return instance;
	}
	
	public void print(List<Customer> customers) {
		System.out.println(customers);
	}
}
