package polimorfismo;

import polimorfismo.entities.Account;
import polimorfismo.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account x = new Account(1020,"Maria", 1000.0);
        Account y = new SavingsAccount(1023, "Master", 1000.0,0.01);

        x.withdraw(50.0);
        y.withdraw(50.0);

        System.out.println(x);
        System.out.println(y);
    }
}
