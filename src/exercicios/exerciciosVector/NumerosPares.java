package exercicios.exerciciosVector;

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            sc.nextLine();
            System.out.print("Digite um numero: ");
            numbers[i]= sc.nextInt();
        }

        int j = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0){


                j++;
            }
        }

        System.out.println(j);

        int[] pares = new int[j];

        int b =0;
        for(int i =0; i < numbers.length; i++){
            if (numbers[i] %2 == 0){
                pares[b] = numbers[i];
                b++;
            }

        }

        System.out.printf("Numeros pares: %n %d %d %d %d%n", pares[0], pares[1], pares[2], pares[3]);

        System.out.printf("Quantidade de pares = %d", j);
    }
}
