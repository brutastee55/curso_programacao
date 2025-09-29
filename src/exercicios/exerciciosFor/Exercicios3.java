package exercicios.exerciciosFor;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios3 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        double mediaPonderada1, mediaPonderada2, mediaPonderada3, somaDosPonderados, media = 0.0;
        int somaPeso;

        for (int i = 0; i < x; i++) {
            double a, b, c;
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();
            mediaPonderada1 = a * 2;
            mediaPonderada2 = b * 3;
            mediaPonderada3 = c * 5;
            somaDosPonderados = mediaPonderada1 + mediaPonderada2 + mediaPonderada3;
            somaPeso = 2 + 3 + 5;
            media = somaDosPonderados / somaPeso;
            System.out.printf("%.1f\n", media);
        }


        sc.close();
    }
}
