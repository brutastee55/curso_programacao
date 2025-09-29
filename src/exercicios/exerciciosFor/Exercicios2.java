package exercicios.exerciciosFor;

import java.util.Scanner;

public class Exercicios2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int in = 0;
        int out = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                in += 1;
            } else {
                out += 1;
            }

        }

        System.out.println("In: "+ in);
        System.out.println("out: "+ out);

        sc.close();
    }
}
