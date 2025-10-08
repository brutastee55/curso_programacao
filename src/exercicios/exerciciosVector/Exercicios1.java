package exercicios.exerciciosVector;

import java.util.Scanner;

public class Exercicios1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        for(int i =0; i <n; i++){
            System.out.print("Digite um numero: ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("Numero negativos:");
        int value;
        for (int i = 0; i < numbers.length; i++){

            if(numbers[i] < 0){
                value = numbers[i];
                System.out.println(value);
            }
        }

        sc.close();
    }
}
