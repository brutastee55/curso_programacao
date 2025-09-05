package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int a, b, resultado;

        System.out.println("informe os dados pra soma 1");


        a = sc.nextInt();
        b = sc.nextInt();

        resultado = a + b;

        System.out.printf("SOMA = %d\n\n", resultado);
        System.out.println("informe os dados pra soma 2");

        a = sc.nextInt();
        b = sc.nextInt();

        resultado = a + b;

        System.out.printf("SOMA = %d\n\n", resultado);
        System.out.println("informe os dados pra soma 3");

        a = sc.nextInt();
        b = sc.nextInt();

        resultado = a + b;

        System.out.printf("SOMA = %d\n\n", resultado);



        sc.close();
    }
}
