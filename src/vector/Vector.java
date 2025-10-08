package vector;

import java.util.Locale;
import java.util.Scanner;

public class Vector {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vector = new double[n];

        for (int i = 0; i < n; i++) {
            vector[i] = sc.nextDouble();
        }
        double result = 0.0;
        for (int i = 0; i < vector.length; i++) {
            result += vector[i];
        }

        System.out.println(result / n);

        sc.close();
    }
}
