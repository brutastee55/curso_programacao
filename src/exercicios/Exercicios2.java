package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        double area;
        double PI = 3.14159;
        double raio;

        System.out.println("informa o raio de um circulo (1)");
        raio = Math.pow(sc.nextDouble(), 2);
        area = raio * PI;

        System.out.printf("A = %.4f\n\n", area);

        System.out.println("informa o raio de um circulo (2)");
        raio = Math.pow(sc.nextDouble(), 2);
        area = raio * PI;

        System.out.printf("A = %.4f\n\n", area);

        System.out.println("informa o raio de um circulo (2)");
        raio = Math.pow(sc.nextDouble(), 2);
        area = raio * PI;

        System.out.printf("A = %.4f\n\n", area);

        sc.close();
    }
}
