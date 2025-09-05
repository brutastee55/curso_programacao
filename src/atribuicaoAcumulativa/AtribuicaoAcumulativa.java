package atribuicaoAcumulativa;

import java.util.Locale;
import java.util.Scanner;

public class AtribuicaoAcumulativa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int minutos;
        double conta = 50.0;

        minutos = sc.nextInt();

        if (minutos > 100)
            conta += (minutos - 100) * 2.0;

        System.out.printf("valor a ser pago? %.2f", conta);
    }
}
