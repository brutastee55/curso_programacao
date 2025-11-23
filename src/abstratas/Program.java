package abstratas;

import abstratas.entities.Account;
import abstratas.entities.BusinessAccount;
import abstratas.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        //Como a account é uma classe abstrata, dá erro ao tentar criar uma instância, ela só pode ser herdada e criar classes específicas,
        //ou seja, a classe Account é uma classe generica do tipo conta e precisa usar polimorfismo para criar instancia das classes que a herda..
       // Account account = new Account(); <-- da erro.

        List<Account> list = new ArrayList<>();

        list.add(new BusinessAccount(1001, "Alex", 500.00, 400.0));
        list.add(new SavingsAccount(1002, "Maria", 1000.00, 0.01));
        list.add(new BusinessAccount(1003, "Jao", 800.00, 500.0));

        double sum = 0.0;
        for (Account acc : list){
            sum += acc.getBalance();
        }

        System.out.println(sum);


        for (Account acc : list){
            acc.deposit(10.0);
        }

        for (Account acc: list){
            System.out.println(acc.getBalance());
        }

    }
}
