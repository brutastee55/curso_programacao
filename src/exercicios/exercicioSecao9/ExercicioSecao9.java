package exercicios.exercicioSecao9;

import exercicios.exercicioSecao9.entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioSecao9 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Conta conta;

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String name = sc.nextLine();


        System.out.print("Is there na initial deposit (y/n)? ");
        String n = sc.next();
        sc.nextLine();

        double value;

        if (n.charAt(0) == 'y') {
            System.out.print("Enter inicial deposit value: ");
            value = sc.nextDouble();
            conta = new Conta(accountNumber, name, value);
        } else {
            conta = new Conta(accountNumber, name);
        }

        System.out.println("Account data:");
        System.out.println(conta);


        System.out.print("Enter a deposit value: ");
        value = sc.nextDouble();
        conta.addValue(value);

        System.out.println("Updated account data:");
        System.out.println(conta);

        System.out.print("Enter a withdraw value: ");
        value = sc.nextDouble();
        conta.removeValue(value);

        System.out.println("Updated account data:");
        System.out.println(conta);
    }
}
