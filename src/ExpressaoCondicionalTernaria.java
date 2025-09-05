public class ExpressaoCondicionalTernaria {
    public static void main(String[] args) {

        double preco = 34.5;
        double desconto = preco < 20.0 ? preco * 0.1 : preco * 0.05;

        String flag = "mster";

        String bandeira = flag.equals("visa") ? "visa" : "master";

        System.out.println(desconto);
        System.out.println(bandeira);
    }
}
