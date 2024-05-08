package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Entre com os dados do produto: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Preço: ");
        double preco = sc.nextDouble();
        System.out.print("Quantidade em estoque: ");
        int quant = sc.nextInt();
        Product product = new Product(nome, preco, quant);

        System.out.println();
        System.out.println("Dados do produto: " + product);

        System.out.println();
        System.out.print("Insira a quantidade que deseja adicionar ao estoque: ");
        quant = sc.nextInt();
        product.addProdutos(quant);

        System.out.println();
        System.out.println("Atualizando dados do produto: " + product);

        System.out.println();
        System.out.print("Insira a quantidade que deseja remover do estoque: ");
        quant = sc.nextInt();
        product.removerProdutos(quant);

        System.out.println();
        System.out.println("Atualizando dados do produto: " + product);




        sc.close();
    }
}