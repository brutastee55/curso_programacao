package exercicios.exerciciosVector;

import java.util.Scanner;

public class SomaVetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();

        int[] A = new int[n];
        int[] B = new int[n];
        int[] C = new int[n];

        for (int i = 0; i < A.length; i++) {
            sc.nextLine();
            System.out.print("Digite os valores do vetor A");
            A[i] = sc.nextInt();

        }

        for (int i = 0; i < B.length; i++) {
            sc.nextLine();
            System.out.print("Digite os valores do vetor B");
            B[i] = sc.nextInt();

        }

        for (int i = 0; i < n; i++) {
            C[i] = A[i] + B[i];
        }

        System.out.printf("VETOR RESULTANTE: %n %d%n %d%n %d%n %d%n %d%n %d%n", C[0], C[1], C[2], C[3], C[4], C[5]);

    }

}
