package exercicios.exerciciosAbstracao.resolvidoPorMim;

import exercicios.exerciciosAbstracao.resolvidoPorMim.entities.Imposto;
import exercicios.exerciciosAbstracao.resolvidoPorMim.entities.PessoaFisica;
import exercicios.exerciciosAbstracao.resolvidoPorMim.entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        List<Imposto> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();

            if (ch == 'i') {
                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Anual income: ");
                double value = sc.nextDouble();

                System.out.print("Health expenditures: ");
                double valueHealth = sc.nextDouble();

                list.add(new PessoaFisica(name, value, valueHealth));
            } else {
                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Anual income: ");
                double value = sc.nextDouble();

                System.out.print("Number of employees: ");
                int numbers = sc.nextInt();

                list.add(new PessoaJuridica(name, value, numbers));
            }

        }

        System.out.println();
        System.out.println("TAXES PAID:");

        for (Imposto imp : list) {
            System.out.printf("%s: $ %.2f%n", imp.getNome(), imp.taxesPaid());
        }

        double sum = 0.0;
        for (Imposto imp : list) {
            sum += imp.taxesPaid();
        }
        System.out.println(

        );
        System.out.printf("TOTAL TAXES: $ %.2f", sum);

        sc.close();
    }
}
