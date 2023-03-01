package org.example;

import java.util.*;
import java.util.logging.Logger;

class Main {
    public static void main(String[] args) {
        Logger l = Logger.getLogger("com.api.jar");
        Scanner se = new Scanner(System.in);
        l.info("enter your name :");
        String accountHolderName = se.next();
        l.info("enter your acc  number :");
        int accountNumber = se.nextInt();
        l.info("Type the balance :");
        int balance = se.nextInt();

        BankA bWw2 = new BankA(accountHolderName, accountNumber, balance);

        while (true) {
            l.info("\n choose a option");
            l.info("\t1.Deposit \n 2.Withdraw \n 3.Balance \n");

            int ch = se.nextInt();
            switch (ch) {
                case 1: {
                    int am = se.nextInt();
                    l.info("AMt Added:");
                    bWw2.deposit(am);
                    break;
                }
                case 2: {
                    l.info("enter the dash amount:");
                    int am = se.nextInt();

                    bWw2.withdraw(am);
                    break;
                }
                case 3: {

                    l.info("\n the balance amount now is" + bWw2.getBalance());
                    break;
                }
                default:
                    se.close();
                    System.exit(0);
            }
        }
    }
}
