package exercicios.execicioMatematica;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int numeroFuncionario;
        int salarioHora;
        double horasTrabalhadas;
        double salario;

        System.out.println("(1) = Informe na seguinte ordem: numero funcionario, valor ganho por hora e as horas trabalhas:");

        numeroFuncionario = sc.nextInt();
        salarioHora = sc.nextInt();
        horasTrabalhadas = sc.nextDouble();

        salario = horasTrabalhadas * salarioHora;

        System.out.printf("Number: %d%nSalario = U$ %.2f\n\n", numeroFuncionario, salario);

        System.out.println("(2) = Informe na seguinte ordem: numero funcionario, valor ganho por hora e as horas trabalhas:");

        numeroFuncionario = sc.nextInt();
        salarioHora = sc.nextInt();
        horasTrabalhadas = sc.nextDouble();

        salario = horasTrabalhadas * salarioHora;

        System.out.printf("Number: %d%nSalario = U$ %.2f\n\n", numeroFuncionario, salario);

        System.out.println("(3) = Informe na seguinte ordem: numero funcionario, valor ganho por hora e as horas trabalhas:");

        numeroFuncionario = sc.nextInt();
        salarioHora = sc.nextInt();
        horasTrabalhadas = sc.nextDouble();

        salario = horasTrabalhadas * salarioHora;

        System.out.printf("Number: %d%nSalario = U$ %.2f", numeroFuncionario, salario);

        sc.close();
    }
}
