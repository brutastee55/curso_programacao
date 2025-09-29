package exercicios.exercicioWhile;

import java.util.Scanner;

public class Exercicios3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int alcool = 0 ;
        int gasolina = 0 ;
        int diesel = 0 ;
        while (x != 4) {
            switch (x) {
                case 1:
                    System.out.println("Álcool");
                    alcool += 1;
                    break;
                case 2:
                    System.out.println("Gasolina");
                    gasolina += 1;
                    break;
                case 3:
                    System.out.println("Diesel");
                    diesel += 1;
                    break;
                default:
                    System.out.println("Informe um numero válido de 1 a 4");
            }
            x = sc.nextInt();
        }
        System.out.println("Muito obrigado");
        System.out.printf("Álcool; %d\n", alcool);
        System.out.printf("Gasolina; %d\n", gasolina);
        System.out.printf("Diesel; %d\n", diesel);

        sc.close();
    }
}
