package sobreposicao;

import sobreposicao.entities.Account;
import sobreposicao.entities.BusinessAccount;
import sobreposicao.entities.SavingsAccount;

public class Program {

    public static void main(String[] args) {

        Account acc1 = new Account(1001, "ALex", 1000.0);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());


        Account acc2 = new SavingsAccount(1002, "Maria", 1000.00, 0.01);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(1003, "Bob", 1000.00, 500.0);
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());

    }
}
