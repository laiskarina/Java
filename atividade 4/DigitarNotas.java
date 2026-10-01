
import java.util.Scanner;

public class DigitarNotas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantas notas voc? deseja digitar?");
        int quantidade = input.nextInt();
        int contador = 0;
        while (contador < quantidade) { 
            System.out.println("Digite a nota "+(contador+1));
            float nota = input.nextFloat();
            contador++;
        }
        input.close();
    }
}