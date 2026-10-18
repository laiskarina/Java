
import java.util.Scanner;

public class DigitarNotas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantas notas voce? deseja digitar?");
        int quantidade = input.nextInt();
        int contador = 0;
        float soma = 0;

        while (contador < quantidade) { 
            System.out.println("Digite a nota "+(contador+1));
            float nota = input.nextFloat();
            soma = soma + nota;
            contador++;
        }

        System.out.printf("Soma das notas: %.2f%n", soma);

        input.close();
    }
}