package dadosEntrada;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String x;
        int s;
        double b;
        char y;

        x = sc.next();
        s = sc.nextInt();
        b = sc.nextDouble();
        y = sc.next().charAt(0);

        System.out.println("voce digitou: " + x +" e " + s + " e " + b + " e " + y);
        sc.close();
    }
}
