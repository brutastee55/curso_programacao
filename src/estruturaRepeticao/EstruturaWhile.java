package estruturaRepeticao;

import java.util.Scanner;

public class EstruturaWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int valor = 0;
        while (number != 0) {
            number = sc.nextInt();
            valor += number;
        }
        System.out.printf("Soma %d", valor);

        sc.close();
    }
}
