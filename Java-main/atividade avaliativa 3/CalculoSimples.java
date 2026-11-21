import java.io.IOException;
import java.util.Scanner;

public class CalculoSimples {
    public static void main (String[] args) throws IOException {
        Scanner ler = new Scanner (System.in);

        System.out.println("CODIGO DO PRIMEIRO PRODUTO: ");
        int codProdUm = ler.nextInt();
        System.out.println("QUANTIDADE DE PRIMEIRO PRODUTO");
        int quantProdUm = ler.nextInt();
        System.out.println("PRECO DO SEGUNDO PRODUTO:");
        double precoProdUm = ler.nextDouble();

        System.out.println("CODIGO DO SEGUNDO PRODUTO: ");
        int codProdDois = ler.nextInt();
        System.out.println("QUANTIDADE DO SEGUNDO PRODUTO: ");
        int quantProdDois = ler.nextInt();
        System.out.println("PRECO DO SEGUNDO PRODUTO: ");
        double precoProdDois = ler.nextDouble();

        double calculoProdUm = quantProdUm * precoProdUm;
        double calculoProdDois = quantProdDois * precoProdDois;

        double valorPagar = calculoProdUm + calculoProdDois;
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorPagar);

        ler.close();

// aqui escrever a multiplicação entre quantidade do produto 1 e o seu preço. Depois quantidade do produto 1 e o seu preco. Depois a soma desses 2 resultados
// acredito que tenho que criar uma nova variável para o resultado de cada novo produto.
// preciso: filar um pouco no temas estilo de como fazem o cálculo, o que vem dps de scanner ler. Como normalmente se pede pra vc dar entrada nos produtos digitando no terminal. o printf formatacao na saída
    }
}