package com.epam.javaIntro.main;

import java.util.List;

import com.epam.javaIntro.entity.Bank;
import com.epam.javaIntro.entity.BankAccount;
import com.epam.javaIntro.entity.Client;
import com.epam.javaIntro.logic.ClientLogic;
import com.epam.javaIntro.view.ClientView;

/*
 * 4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность 
 * блокировки/разблокировки счета. Реализовать поиск и сортировку счетов. Вычисление
 * общей суммы по счетам. Вычисление суммы по всем счетам, имеющим положительный и 
 * отрицательный балансы отдельно.
 */

public class Main {
	
	public static void main(String[] args) {
		
		ClientView view = new ClientView();
		ClientLogic logic = new ClientLogic();
		
		BankAccount accountFirst = new BankAccount(123, 3000, false);
		BankAccount accountSecond = new BankAccount(567, 600, false);
		BankAccount accountThird = new BankAccount(32, -200, false);
		BankAccount accountFourth = new BankAccount(564, -300, false);
		BankAccount accountFifth = new BankAccount(67, 3000, true);
		
		Client clientFirst = new Client(1, "Ivan", "Ivanov");
		clientFirst.addAccount(accountFirst);
		clientFirst.addAccount(accountSecond);
		clientFirst.addAccount(accountThird);
		Client clientSecond = new Client(2, "Petr", "Petrov");
		clientSecond.addAccount(accountFourth);
		clientSecond.addAccount(accountFifth);
		
		Bank bank = new Bank("BPS");
		bank.addClient(clientFirst);
		bank.addClient(clientSecond);
		
		BankAccount findAccount = logic.findAccountByNum(clientFirst, 32);
		view.print(findAccount);
		List<BankAccount> sortAccounts1 = logic.sortAccounts(clientFirst);
		view.print(sortAccounts1);
		List<BankAccount> sortAccounts2 = logic.sortAccounts(clientSecond);
		view.print(sortAccounts2);
		logic.getSum(clientFirst);
		logic.getSum(clientSecond);
		logic.getPositiveSum(clientFirst);
		logic.getPositiveSum(clientSecond);
		logic.getNegativeSum(clientFirst);
		logic.getNegativeSum(clientSecond);
		
	}

}
