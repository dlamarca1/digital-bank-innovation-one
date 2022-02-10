package com.dio.digital.bank.model;

public class SavingsAccount extends Account {

    public SavingsAccount(Customer customer) {
        super(customer);
    }

    @Override
    public void printStatement() {
        System.out.println("=== Savings Account Statement ===");
        super.printCommonInformation();
    }

}
