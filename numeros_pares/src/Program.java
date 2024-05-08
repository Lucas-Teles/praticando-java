import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] arg){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        int quantPares = 0;


        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();
        int[] vet = new int[n];

        for (int i = 0; i<vet.length; i++){
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextInt();
        }

        System.out.println("NUMEROS PARES:");
        for (int i = 0; i<vet.length; i++){
            if (vet[i] % 2 == 0){
                System.out.print(vet[i] + " ");
                quantPares += 1;
            }
        }
        System.out.println();
        System.out.print("QUANTIDADE DE PARES = " + quantPares);

        sc.close();
    }
}
