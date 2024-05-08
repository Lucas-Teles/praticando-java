import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double soma = 0;
        double media, valores;

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] vet = new double[n];

        for(int i = 0; i < vet.length; i++){
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();

            soma += vet[i];
        }

        System.out.print("Valores =");

        for (int i = 0; i < vet.length; i++){
            System.out.print(" " + vet[i]);
        }
        System.out.println();
        media = soma / vet.length;
        System.out.println("Soma = " + soma);
        System.out.println("Media = " + media);


        sc.close();
    }
}
