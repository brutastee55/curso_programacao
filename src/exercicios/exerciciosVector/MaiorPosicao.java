package exercicios.exerciciosVector;

import java.util.Arrays;
import java.util.Locale;
import java.util.OptionalDouble;
import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("quantos numeros vc vai digitar? ");

        int n = sc.nextInt();
        double[] vetor = new double[n];

        for (int i = 0; i < vetor.length; i++) {
            sc.nextLine();
            System.out.print("Digite um numero:");
            vetor[i] = sc.nextDouble();
        }

        OptionalDouble maior = Arrays.stream(vetor).max();


        if (maior.isPresent()) {
            System.out.println("Maior valor" + maior.getAsDouble());
        }


        int posicao = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == maior.getAsDouble()) {
                posicao = i;
            }
        }

        System.out.printf("Posicao do maior valor = %d", posicao);

    }
}
