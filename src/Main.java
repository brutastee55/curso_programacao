import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        int y = 32;
        double x = 10.35784;
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println(y);
        System.out.println(x);
        System.out.println("Olá mundo!");
        System.out.printf("%.2f\n", x);

        System.out.printf("%.2f\n", x);
        System.out.println("resultado: " + y + " metros");
        System.out.printf("resultado: %.2f%n",x);
        System.out.printf("%s tem, %d ano e ganha %.1f reais ao mes%n%n", nome, idade, renda);


        System.out.printf("Products:\n%s, whitch price is $ %.2f%n%s, whitch price is $ %.2f%n%nRecord: %d years old, code %d and gender: %s%n%nMeasue with eight decimal places: %.8f%nRouded (three decimal places): %2.3f%n", product1,price1,product2, price2,age,code,gender,measure,measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f", measure);
    }

}
