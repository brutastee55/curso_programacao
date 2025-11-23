package tryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {

        method1();

        System.out.println("End of program");
    }

    public static void method1() {
        System.out.println("***********METOHOD1 START**********");
        method2();
        System.out.println("***********METHOD1 END***********");
    }

    public static void method2() {
        System.out.println("***********METOHOD2 START**********");
        Scanner sc = new Scanner(System.in);
        String[] vect = new String[0];

        try {
            vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.printf("Posicão invalida, só existe essas opções: %d!%n", vect.length);
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("Modo de entrada deve ser numerico");
        }

        sc.close();
        System.out.println("***********METHOD2 END***********");
    }
}
