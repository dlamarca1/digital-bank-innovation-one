package com.dio.digital.bank.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Account implements IAccount {

    private static final int STANDARD_ACCOUNT = 1;
    private static int SEQUENTIAL = 1;
    protected int agency;
    protected int number;
    protected double balance;
    protected Customer customer;

    public Account(Customer customer) {
        this.agency = Account.STANDARD_ACCOUNT;
        this.number = SEQUENTIAL++;
        this.customer = customer;
    }

    @Override
    public void withdraw(double value) {
        balance -= value;
    }

    @Override
    public void deposit(double value) {
        balance += value;
    }

    @Override
    public void transfer(double value, Account destinationAccount) {
        this.withdraw(value);
        destinationAccount.deposit(value);
    }
    protected void printCommonInformation() {
        System.out.println(String.format("Account Holder: %s", this.customer.getName()));
        System.out.println(String.format("Agency: %d", this.agency));
        System.out.println(String.format("Number: %d", this.number));
        System.out.println(String.format("Balance: %2f", this.balance));
    }
}
