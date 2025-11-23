package exercicios.exercicioPolimorfismo.resolvido;

import exercicios.exercicioPolimorfismo.resolvido.entities.Employee;
import exercicios.exercicioPolimorfismo.resolvido.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.printf("Employee #%d data: %n", i + 1);

            System.out.print("Outsourced (y/n)? ");
            String x = sc.nextLine();


            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Hours: ");
            int hours = sc.nextInt();

            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if (x.charAt(0) == 'y') {
                System.out.print("Additional charge: ");
                double additonal = sc.nextDouble();

                Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additonal);
                list.add(emp);
            } else {

                list.add(new Employee(name, hours, valuePerHour));
            }
        }

        System.out.println();
        System.out.println("PAYMENTS");
        for (Employee emp : list) {
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }
        sc.close();
    }
}
