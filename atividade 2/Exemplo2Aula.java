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

//  Scanner input = --> aqui você está criando um objeto da classe Scanner, chamado input.
// new Scanner -->
// (System.in); é o parâmetro que diz "leia do teclado" (entrada padrão do sistema).
// o input é só pra declarar o scanner. Porque input significa entrada, mas pode ser qualquer nome, por exemplo Rogerio.

// if: se
// else: senão/caso contrário
// if else: se senão/ se caso contrário