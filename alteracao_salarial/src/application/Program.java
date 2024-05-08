package application;


import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee  employee = new Employee();

        System.out.println(" --- Dados do funcionario ---");
        System.out.print("Nome: ");
        employee.name = sc.nextLine();
        System.out.print("Salario bruto: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Taxa: ");
        employee.tax = sc.nextDouble();

        System.out.println(employee);

        System.out.print("Insira o valor do percentual a ser aumentado: ");
        double percentage = sc.nextDouble();
        employee.grossSalary = employee.IncreaseSalary(percentage);

        System.out.println("--- Dados atualizados --- ");
        System.out.println(employee);

        sc.close();
    }
}
