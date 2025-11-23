package exercicios.exerciciosComposicaoEnumeracao.resolvido;

import exercicios.exerciciosComposicaoEnumeracao.resolvido.entities.Departament;
import exercicios.exerciciosComposicaoEnumeracao.resolvido.entities.HourContract;
import exercicios.exerciciosComposicaoEnumeracao.resolvido.entities.Work;
import exercicios.exerciciosComposicaoEnumeracao.resolvido.entities.enums.WorkLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioComposicaoResolvido {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Entre com o nome do departamento: ");
        String departamentName = sc.nextLine();

        System.out.println("Enter worker data: ");

        System.out.print("Name: ");
        String workerName = sc.nextLine();

        System.out.print("Level: ");
        String workerLevel = sc.nextLine();

        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();

        Work work = new Work(workerName, WorkLevel.valueOf(workerLevel), baseSalary, new Departament(departamentName));

        System.out.print("Quantos contratos esse trabalhador vai ter? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.printf("Enter contract number : #%d%n", i);

            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());

            System.out.print("Valor por hora: ");
            double valorHora = sc.nextDouble();

            System.out.print("Duracao (horas): ");
            int hours = sc.nextInt();

            HourContract contract = new HourContract(contractDate, valorHora, hours);
            work.addContract(contract);
        }

        System.out.println();
        System.out.print("Entre com mes e ano para calcular o salario: (MM/YYYY): ");
        String mesDia = sc.next();
        int mes = Integer.parseInt(mesDia.substring(0, 2));
        int ano = Integer.parseInt((mesDia.substring(3)));

        System.out.println("name: " + work.getName());
        System.out.println("Departament: " + work.getDepartament().getName());
        System.out.println("incomer for " + mesDia + ": " + String.format("%.2f", work.income(ano, mes)));

        sc.close();
    }
}
