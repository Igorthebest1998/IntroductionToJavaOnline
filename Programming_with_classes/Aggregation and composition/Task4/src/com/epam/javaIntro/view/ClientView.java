package com.epam.javaIntro.view;

import java.util.List;

import com.epam.javaIntro.entity.BankAccount;
import com.epam.javaIntro.entity.Client;

public class ClientView {
	
	public void print(Client client) {
		System.out.println("User " + client.getName() + " " + client.getSurname() + ":");
		for (BankAccount account : client.getAccounts()) {
			System.out.println("   Account: " + account.getId() + " sum: " + account.getSum());
		}
	}
	
	public void print(BankAccount account) {
		System.out.println(account);
	}
	
	public void print(List<BankAccount> accounts) {
		for (BankAccount account : accounts) {
			System.out.println(account);
		}
	}

}
