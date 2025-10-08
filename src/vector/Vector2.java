package vector;

import vector.entities.Produtos;

import java.util.Locale;
import java.util.Scanner;

public class Vector2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Produtos[] vect = new Produtos[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Produtos(name, price);
        }

        double result = 0.0;
        for (int i = 0; i < vect.length; i++) {
            result += vect[i].getPrice();
        }

        System.out.printf("Valor total:  %.2f%n", result/n);

        sc.close();
    }
}
