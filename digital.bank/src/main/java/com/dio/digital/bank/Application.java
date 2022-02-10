package com.dio.digital.bank;

import com.dio.digital.bank.model.Account;
import com.dio.digital.bank.model.CheckingAccount;
import com.dio.digital.bank.model.Customer;
import com.dio.digital.bank.model.SavingsAccount;

public class Application {

	public static void main(String[] args) {
		Customer costumer = new Customer();
		costumer.setName("costumer");

		Account ca = new CheckingAccount(costumer);
		Account sa = new SavingsAccount(costumer);

		ca.printStatement();
		sa.printStatement();
	}

}
