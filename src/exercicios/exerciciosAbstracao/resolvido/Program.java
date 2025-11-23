package exercicios.exerciciosAbstracao.resolvido;

import exercicios.exerciciosAbstracao.resolvido.entities.Circle;
import exercicios.exerciciosAbstracao.resolvido.entities.Rectangle;
import exercicios.exerciciosAbstracao.resolvido.entities.Shape;
import exercicios.exerciciosAbstracao.resolvido.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();
        Color color;

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char x = sc.next().charAt(0);

            sc.nextLine();

            System.out.print("Color (BLACK/BLUE/RED): ");
            String cor = sc.nextLine();

            if (x == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();

                System.out.print("Height: ");
                double height = sc.nextDouble();

                color = Color.valueOf(cor);

                list.add(new Rectangle(color, width, height));
            } else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();

                color = Color.valueOf(cor);

                list.add(new Circle(color, radius));
            }
        }

        System.out.println();
        System.out.println("SHAPE AREAS: ");
        for (Shape shape : list) {
            System.out.printf("%.2f%n", shape.area());
        }

        sc.close();
    }
}
