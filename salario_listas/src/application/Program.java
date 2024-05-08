package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Quantos funcionarios vão ser registrados? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Funcionario #" + (i + 1) + ": ");
            System.out.print("ID: ");
            Integer id = sc.nextInt();
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salario: ");
            Double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);

            list.add(emp);
        }

        System.out.println("Insira o ID do funcionario que vai ter aumento salarial: ");
        int idSalary = sc.nextInt();
        Integer pos = position(list, idSalary);
        if (pos == null){
            System.out.println("Este ID não existe!");
        }else {
            System.out.println("Qual porcentagem ira aumentar? ");
            double percent = sc.nextDouble();
            list.get(pos).inscreaseSalary(percent);
        }
        System.out.println();
        System.out.println("Lista de funcionarios:");

        for (Employee emp: list){
            System.out.println(emp);
        }




        sc.close();
    }

    public static Integer position(List<Employee> list, int id){
        for (int i = 0; i < list.size() ; i++) {
            if (list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }
}
