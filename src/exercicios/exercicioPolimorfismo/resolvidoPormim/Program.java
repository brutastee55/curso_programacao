package exercicios.exercicioPolimorfismo.resolvidoPormim;

import exercicios.exercicioPolimorfismo.resolvidoPormim.entites.ImportedProduct;
import exercicios.exercicioPolimorfismo.resolvidoPormim.entites.Product;
import exercicios.exercicioPolimorfismo.resolvidoPormim.entites.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int x = 1; x <= n; x++) {
            sc.nextLine();
            System.out.printf("Product #%d data:%n", x);

            System.out.print("Common, used or imported (c/u/i)? ");
            String c = sc.nextLine();


            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (c.charAt(0) == 'i') {

                System.out.print("Customs fee: ");
                double custom = sc.nextDouble();
                products.add(new ImportedProduct(name, price, custom));
            } else if (c.charAt(0) == 'u') {
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String date = sc.next();

                Date date1 = formatter.parse(date);
                products.add(new UsedProduct(name, price, date1));
            } else {
                products.add(new Product(name, price));
            }

        }

        System.out.println("Price Tags: ");
        for (Product product : products) {
            System.out.println(product.priceTag());
        }


        sc.close();
    }
}
