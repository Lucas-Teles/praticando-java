package application;


import entities.Circulo;
import entities.Forma;
import entities.Retangulo;
import entitiesEnums.Color;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Forma> list = new ArrayList<>();

        System.out.print("Quantas formas deseja inserir: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Forma #" + i + " - dados: ");
            System.out.print("Retangulo ou Circulo (r/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Cor? (BLACK/BLUE/RED)");
            Color color = Color.valueOf(sc.next());
            if (ch == 'r'){
                System.out.print("Largura: ");
                double width = sc.nextDouble();
                System.out.print("Altura: ");
                double height = sc.nextDouble();
                list.add(new Retangulo(color, width, height));
            }else {
                System.out.print("Raio: ");
                double radius = sc.nextDouble();
                list.add(new Circulo(color, radius));
            }
        }

        System.out.println();
        System.out.println("Areas das formas");
        for (Forma forma : list){
            System.out.println(String.format("%.2f", forma.area()));
        }
        sc.close();
    }
}
