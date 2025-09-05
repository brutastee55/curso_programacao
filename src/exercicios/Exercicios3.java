package exercicios;

import java.util.Scanner;

public class Exercicios3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b, c, d, diferenca;

        System.out.println("Informe no console 4 valores e descubra a difereça: 1");

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        diferenca = (a*b) - (c*d);

        System.out.printf("Diferença = %d%n%n", diferenca);

        System.out.println("Informe no console 4 valores e descubra a difereça: 2");

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        diferenca = (a*b) - (c*d);

        System.out.printf("Diferença = %d%n%n", diferenca);

        sc.close();
    }
}
