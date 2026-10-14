import java.io.IOException;

import java.util.Scanner;

public class ProdutoSimples {

    public static void main (String[] args) throws IOException {
        Scanner ler = new Scanner (System.in);

            //System.out.println("Digite um número inteiro: ");
            int num1 = ler.nextInt();
            
            //System.out.println("Digite outro número inteiro: ");
            int num2 = ler.nextInt();

            int PROD = (num1 * num2);
            System.out.println("PROD = " + PROD);

            //caucular produto
            // armazenar o produto numa variável PROD
    }
}