package tryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] vect = new String[0];

        try {
            vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.printf("Posicão invalida, só existe essas opções: %d!%n", vect.length);
        } catch (InputMismatchException e){
            System.out.println("Modo de entrada deve ser numerico");
        }

        System.out.println("End of Program");
        sc.close();
    }
}
