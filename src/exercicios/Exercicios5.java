package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int codigoPeca1, codigoPeca2, quantidade1, quantidade2;
        double valor1, valor2, total;

        System.out.println("(1) Informe o codigo da peça, informe a quantidade que deseja compra eo valor:");
        codigoPeca1 = sc.nextInt();
        quantidade1 = sc.nextInt();
        valor1 = sc.nextDouble();

        codigoPeca2 = sc.nextInt();
        quantidade2 = sc.nextInt();
        valor2 = sc.nextDouble();

        total = (quantidade1 * valor1) + (quantidade2 * valor2);

        System.out.printf("Valor a pagar: R$ %.2f%n%n", total);

        System.out.println("(2) Informe o codigo da peça, informe a quantidade que deseja compra eo valor:");
        codigoPeca1 = sc.nextInt();
        quantidade1 = sc.nextInt();
        valor1 = sc.nextDouble();

        codigoPeca2 = sc.nextInt();
        quantidade2 = sc.nextInt();
        valor2 = sc.nextDouble();

        total = (quantidade1 * valor1) + (quantidade2 * valor2);

        System.out.printf("Valor a pagar: R$ %.2f%n%n", total);

        System.out.println("(3) Informe o codigo da peça, informe a quantidade que deseja compra eo valor:");
        codigoPeca1 = sc.nextInt();
        quantidade1 = sc.nextInt();
        valor1 = sc.nextDouble();

        codigoPeca2 = sc.nextInt();
        quantidade2 = sc.nextInt();
        valor2 = sc.nextDouble();

        total = (quantidade1 * valor1) + (quantidade2 * valor2);

        System.out.printf("Valor a pagar: R$ %.2f%n%n", total);


        sc.close();
    }
}
