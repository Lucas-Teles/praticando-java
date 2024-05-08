package application;

import entities.Contribuintes;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com numero de contribuintes: ");
        int n = sc.nextInt();

        List<Contribuintes> list = new ArrayList<Contribuintes>();
        for (int i = 1; i <= n ; i++) {
            System.out.print("Contribuinte #" + i + " pessoa fisica ou juridica (f/j): ");
            char tipo = sc.next().charAt(0);
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Renda anual: ");
            Double rendaAnual = sc.nextDouble();

            if (tipo == 'f'){
                System.out.print("Gastos com saúde: ");
                Double gastoComSaude = sc.nextDouble();
                list.add(new PessoaFisica(nome, rendaAnual, gastoComSaude));
            } else {
                System.out.print("Número de funcionarios: ");
                Integer numeroDeFuncionarios = sc.nextInt();
                list.add(new PessoaJuridica(nome,rendaAnual, numeroDeFuncionarios));
            }
        }

        System.out.println();
        System.out.println("Impostos a pagar: ");

        for (Contribuintes ct : list) {
            System.out.println(ct.getNome() + ": $ " + String.format("%.2f", ct.imposto()));
        }

        System.out.println();
        double soma = 0.0;
        for (Contribuintes ct : list){
            soma += ct.imposto();
        }
        System.out.println("Total de impostos: $" + String.format("%.2f",soma));

        sc.close();
    }
}
