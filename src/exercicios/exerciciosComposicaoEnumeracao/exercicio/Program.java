package exercicios.exerciciosComposicaoEnumeracao.exercicio;

import exercicios.exerciciosComposicaoEnumeracao.exercicio.entities.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter cliente data: ");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data: ");
        sc.nextLine();
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(), status, client);

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter #%d item data: %n", i + 1);
            System.out.print("Product name: ");
            sc.nextLine();
            String nameProduto = sc.nextLine();

            System.out.print("Product price: ");
            double produtPrice = sc.nextDouble();

            System.out.print("Quantity: ");
            int quantidadeItens = sc.nextInt();


            Product product = new Product(nameProduto, produtPrice);
            OrderItem orderItem = new OrderItem(quantidadeItens, produtPrice, product);


            order.addItems(orderItem);

        }

        System.out.println();
        System.out.println(order);

        sc.close();
    }
}