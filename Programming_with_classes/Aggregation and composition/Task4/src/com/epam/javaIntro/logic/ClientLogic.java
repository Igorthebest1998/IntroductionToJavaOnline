package com.epam.javaIntro.logic;

import java.util.Collections;
import java.util.List;

import com.epam.javaIntro.entity.BankAccount;
import com.epam.javaIntro.entity.Client;

public class ClientLogic {
	
	public BankAccount findAccountByNum(Client client, int id) {
		List<BankAccount> accounts = client.getAccounts()
;		for(BankAccount account : accounts) {
			if (account.getId() == id) return account;
		}
		return null;
	}
	
	public List<BankAccount> sortAccounts(Client client) {
		List<BankAccount> accounts = client.getAccounts();
		Collections.sort(accounts);
		return accounts; 
	}
	
	public void getSum(Client client) {
		List<BankAccount> accounts = client.getAccounts();
		int sum = 0;
		for (BankAccount account : accounts) {
			sum += account.getSum();
		}
		System.out.printf("Sum balances of %s %s: %d \n", client.getName(),
				client.getSurname(), sum);
	}
	
	public void getPositiveSum(Client client) {
		List<BankAccount> accounts = client.getAccounts();
		int sum = 0;
		for (BankAccount account : accounts) {
			if (account.getSum() > 0) {
				sum += account.getSum();
			}
		}
		System.out.printf("Sum positive balances of %s %s: %d \n", client.getName(),
				client.getSurname(), sum);
	}
	
	public void getNegativeSum(Client client) {
		List<BankAccount> accounts = client.getAccounts();
		int sum = 0;
		for (BankAccount account : accounts) {
			if (account.getSum() < 0) {
				sum += account.getSum();
			}
		}
		System.out.printf("Sum negative balances of %s %s: %d \n", client.getName(),
				client.getSurname(), sum);
	}

}
