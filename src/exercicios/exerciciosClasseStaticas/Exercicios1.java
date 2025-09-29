package exercicios.exerciciosClasseStaticas;

import exercicios.exerciciosClasseStaticas.entidade.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dolarValue = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double dolarQuantity = sc.nextDouble();

        System.out.printf("Amout to be paid in reais = %.2f" ,CurrencyConverter.converterDolarReal(dolarValue, dolarQuantity));
    }
}
