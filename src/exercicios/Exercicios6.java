package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c, trianguloRetangulo, circulo, trapezio, quadrado, retangulo;
        System.out.println("(1:) Informe os valores para calculo de áreas");

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        trianguloRetangulo = (a * c) / 2.0;
        circulo = (Math.pow(c, 2)) * 3.14159;
        trapezio = (a + b) * c /2;
        quadrado = Math.pow(b,2);
        retangulo = a * b;

        System.out.printf("Triangulo: %.3f%nCirculo: %.3f%nTrapezio: %.3f%nQuadrado: %.3f%nRetangulo: %.3f%n%n", trianguloRetangulo, circulo, trapezio, quadrado, retangulo);

        System.out.println("(2:) Informe os valores para calculo de áreas");

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        trianguloRetangulo = (a * c) / 2.0;
        circulo = (Math.pow(c, 2)) * 3.14159;
        trapezio = (a + b) * c /2;
        quadrado = Math.pow(b,2);
        retangulo = a * b;

        System.out.printf("Triangulo: %.3f%nCirculo: %.3f%nTrapezio: %.3f%nQuadrado: %.3f%nRetangulo: %.3f%n%n", trianguloRetangulo, circulo, trapezio, quadrado, retangulo);

        System.out.println("(3:) Informe os valores para calculo de áreas");

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        trianguloRetangulo = (a * c) / 2.0;
        circulo = (Math.pow(c, 2)) * 3.14159;
        trapezio = (a + b) * c /2;
        quadrado = Math.pow(b,2);
        retangulo = a * b;

        System.out.printf("Triangulo: %.3f%nCirculo: %.3f%nTrapezio: %.3f%nQuadrado: %.3f%nRetangulo: %.3f%n%n", trianguloRetangulo, circulo, trapezio, quadrado, retangulo);

        sc.close();
    }
}
