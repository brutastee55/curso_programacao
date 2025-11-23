package exercicios.exerciciosLista;

import exercicios.exerciciosLista.entities.Funcionarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioLista {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos funcionarios você quer registrar?");
        int n = sc.nextInt();
        
        Funcionarios[] funcionarios = new Funcionarios[n];

        List<Funcionarios> funcionarios1 = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.printf("Funcionario #%d%n", i + 1);

            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            funcionarios1.add(funcionarios[i] = new Funcionarios(id, name, salary));
        }

        System.out.print("Informe o Id do funcionario que quer aumentar o salario : ");
        int id = sc.nextInt();

        List<Funcionarios> result = funcionarios1.stream().filter(x -> x.getId() == id).toList();

        if (result.isEmpty()) {
            System.out.printf("id não existe%n%n");
        } else {
            Funcionarios func = result.get(0);
            for (Funcionarios funcionario : funcionarios) {
                if (funcionario.getId() == func.getId()) {
                    System.out.print("Informe q porcentagem: ");
                    double aumento = sc.nextDouble();
                    funcionario.aumentarSalario(func.getId(), aumento);
                }
            }
        }


        System.out.println("Lista de funcionarios: ");
        for (Funcionarios fun : funcionarios1) {
            System.out.println(fun);
        }


        sc.close();
    }
}
