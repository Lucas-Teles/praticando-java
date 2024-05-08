import java.util.Locale;
import java.util.Scanner;

public class negativos {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num;


        System.out.print("Quantos numeros voce vai digitar? ");
        num = sc.nextInt();

        int[] vetor = new int[num];

        for (int i = 0; i < vetor.length; i++){
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS: ");

        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] < 0){
                System.out.printf("%d\n", vetor[i]);
            }
        }

        sc.close();
    }
}
