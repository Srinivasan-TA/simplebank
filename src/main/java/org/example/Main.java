package org.example;

import java.util.*;
import java.util.logging.Logger;

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
        logger.log(balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            logger.log("Insufficient funds");
        } else {
            balance -= amount;
            logger.log(balance);
        }
    }

    public double getBalance() {
        logger.log(this.accountHolderName);
        logger.log(this.accountNumber);
        return balance;
    }
}
class Main {
    public static void main(String[] args) {
        Logger l = Logger.getLogger("com.api.jar");

        Scanner se = new Scanner(System.in);
        logger.log("enter your name :");
        String accountHolderName = se.next();
        logger.log("enter your acc  number :");
        int accountNumber = se.nextInt();
        logger.log("Type the balance :");
        int balance = se.nextInt();

        Boolean loop=true;

        BankA B = new BankA(accountHolderName,accountNumber,balance);

        while(loop==true){
            logger.log("\n choose a option");
            logger.log("\t1.Deposit \n 2.Withdraw \n 3.Balance \n");

            int ch = se.nextInt();
            switch(ch){
                case 1:
                {
                    int am=se.nextInt();
                    logger.log("Balance amount now is:");
                    B.deposit(am);
                    break;
                }
                case 2:
                {
                    logger.log("enter the amount:");
                    int am=se.nextInt();

                    B.withdraw(am);
                    break;
                }
                case 3 :
                {

                    logger.log("\n the balance amount now is" +B.getBalance());
                    break;
                }
                default:
              se.close();
            }
        }
    }
}