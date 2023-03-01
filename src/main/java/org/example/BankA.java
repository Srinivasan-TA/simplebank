package org.example;

import java.util.logging.Logger;
class BankA extends Main {
    private String accountHolderName;
    private int accountNumber;
    private double balance;
    Logger l = Logger.getLogger("com.api.jar");
    public BankA(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {

        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            l.info("Insufficient funds");
        } else {
            balance -= amount;
        }
    }

    public double getBalance() {
        l.info(this.accountHolderName);
        return balance;
    }
}

