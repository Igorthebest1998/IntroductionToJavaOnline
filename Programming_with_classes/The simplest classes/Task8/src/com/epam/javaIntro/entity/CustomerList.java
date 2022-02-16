package com.epam.javaIntro.entity;

import java.util.ArrayList;
import java.util.List;

public class CustomerList {
	
	private List<Customer> customers;

	public CustomerList() {
		super();
		customers = new ArrayList<Customer>();
	}

	@Override
	public String toString() {
		return "CustomerList [customers=" + customers + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customers == null) ? 0 : customers.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerList other = (CustomerList) obj;
		if (customers == null) {
			if (other.customers != null)
				return false;
		} else if (!customers.equals(other.customers))
			return false;
		return true;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void addCustomer(Customer customer) {
		customers.add(customer);
	}

}
