package analisarDebug;

import java.util.Locale;
import java.util.Scanner;

public class Debug {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double largura, comprimento, metroQuadrado;
        largura = sc.nextDouble();
        comprimento = sc.nextDouble();
        metroQuadrado = sc.nextDouble();

        double area = largura * comprimento;
        double preco = area * metroQuadrado;

        System.out.printf("Area = %.2f%n", area);
        System.out.printf("Preco = %.2f%n", preco);

        sc.close();
    }
}
