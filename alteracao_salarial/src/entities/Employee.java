package entities;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;

    public double IncreaseSalary(double percentage){
        return grossSalary + (grossSalary * (percentage/100));
    }

    public double NetSalary(){
        return grossSalary - tax;
    }

    public String toString(){
        return "Funcionario: "
                + name
                + ", $ "
                + String.format("%.2f", NetSalary());
    }
}
