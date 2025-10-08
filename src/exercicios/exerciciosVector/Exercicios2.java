package exercicios.exerciciosVector;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros vc vai digitar? ");
        int n = sc.nextInt();

        double[] numbers = new double[n];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um numero: ");
            numbers[i] = sc.nextDouble();
        }

        double soma = 0.0;

        for (int i = 0; i < numbers.length; i++) {
            soma += numbers[i];
        }

        System.out.printf("Valores = %.1f %.1f %.1f %.1f%n", numbers[0], numbers[1], numbers[2], numbers[3]);
        System.out.printf("Soma = %.2f%n", soma);
        System.out.printf("Media = %.2f", soma / n);
    }
}
