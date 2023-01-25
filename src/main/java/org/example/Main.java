package org.example;

import java.io.*;
import java.util.*;
class BankA extends Main {
    private String accountHolderName;
    private int accountNumber;
    private double balance;

    public BankA(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds");
        } else {
            balance -= amount;
            System.out.println(balance);
        }
    }

    public double getBalance() {
        System.out.println(this.accountHolderName);
        System.out.println(this.accountNumber);
        return balance;
    }
}
class Main {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        System.out.println("enter your name :");
        String accountHolderName = se.next();
        System.out.println("enter your acc  number :");
        int accountNumber = se.nextInt();
        System.out.println("Type the balance :");
        int balance = se.nextInt();

        Boolean loop=true;

        BankA B1 = new BankA(accountHolderName,accountNumber,balance);

        while(loop==true){
            System.out.println("\n choose a option");
            System.out.println("\t1.Deposit \n 2.Withdraw \n 3.Balance \n");

            int ch = se.nextInt();
            switch(ch){
                case 1:
                {
                    System.out.println("enter the amount:");
                    int am=se.nextInt();
                    System.out.println("Balance amount now is:");
                    B1.deposit(am);
                    break;
                }
                case 2:
                {
                    System.out.println("enter the amount:");
                    int am=se.nextInt();

                    B1.withdraw(am);
                    break;
                }
                case 3 :
                {

                    System.out.println("\n the balance amount now is" +B1.getBalance());
                    break;
                }
                default:
                {
                    loop=false;
                }
                se.close();    }
        }
    }
}