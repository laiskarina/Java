import java.util.Scanner;

public class Exemplo2Aula {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int x = input.nextInt();
        if (x < 0) {
            System.out.println("Número negativo!");
        } else if (x > 0) {
            System.out.println("Número positivo!");
        } else if (x == 0) {
            System.out.println("Número neutro!");
        }
        
    }
}
