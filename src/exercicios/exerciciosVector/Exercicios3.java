package exercicios.exerciciosVector;

import exercicios.exerciciosVector.entities.Pessoas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        Pessoas[] pessoas = new Pessoas[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.printf("Dados da %da pessoa: %n", i + 1);

            System.out.print("Nome: ");
            String name = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            pessoas[i] = new Pessoas(name, idade, altura);
        }

        double soma = 0.0;
        int menore = 0;
        double percentual = 0.0;

        for (int i = 0; i < pessoas.length; i++) {
            soma += pessoas[i].getAltura();
            if (pessoas[i].getIdade() < 16) {
                menore++;
            }
        }

        String[] menores = new String[menore];

        int j = 0;
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getIdade() < 16) {
                menores[j] = pessoas[i].getName();
                j++;
            }
        }

        percentual = ((double) menore / n) * 100.0;

        System.out.printf("media = %.2f%n", soma / n);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%% %n", percentual);

        for (int i = 0; i < menores.length; i++) {
            System.out.println(menores[i]);
        }

    }
}
