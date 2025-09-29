package exercicios.orientacaoObjeto;

import exercicios.orientacaoObjeto.entidade.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        employee.name = sc.nextLine();
        employee.grossSalary = sc.nextDouble();
        employee.tax = sc.nextDouble();

        System.out.print("Employee: ");
        System.out.println(employee);
        System.out.print("Which percentage to increase salary? ");
        System.out.println();
        double value = sc.nextDouble();
        employee.increaseSalary(value);
        System.out.print("Update data: ");
        System.out.println(employee);


        sc.close();
    }
}
