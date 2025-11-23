package UpcastingDownCasting;

import UpcastingDownCasting.entities.Account;
import UpcastingDownCasting.entities.BusinessAccount;
import UpcastingDownCasting.entities.SavingsAccount;

public class Program {

    public static void main(String[] args) {

        Account acc = new Account(1001, "ALex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.00);

        //UPCASTING

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.00);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        //DOWNCASTING

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);


        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        } else if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

    }
}
