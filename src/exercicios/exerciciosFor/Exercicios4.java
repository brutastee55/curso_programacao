package exercicios.exerciciosFor;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios4 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for (int i = 0; i < x; i++) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            if (a !=0  && b == 0) {
                System.out.println("divisão impossivel");
            } else {
                System.out.println(a / b);
            }
        }

        sc.close();
    }
}
