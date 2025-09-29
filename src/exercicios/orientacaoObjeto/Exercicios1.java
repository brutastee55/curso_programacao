package exercicios.orientacaoObjeto;

import exercicios.orientacaoObjeto.entidade.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();
        System.out.println(rectangle);

    }
}
