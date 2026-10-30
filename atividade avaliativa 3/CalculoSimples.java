import java.io.IOException;
import java.util.Scanner;

public class CalculoSimples {
    public static void main (String[] args) throws IOException {
        Scanner ler = new Scanner (System.in);

        System.out.println("CODIGO DO PRIMEIRO PRODUTO: ");
        int CodProdUm = ler.nextInt();
        System.out.println("QUANTIDADE DE PRIMEIRO PRODUTO");
        int QuantProdUm = ler.nextInt();
        System.out.printf("%2f% PRECO DO SEGUNDO PRODUTO: ");
        double PrecoProdUm = ler.nextDouble();

        System.out.println("CODIGO DO SEGUNDO PRODUTO: ");
        int CodProdDois = ler.nextInt();
        System.out.println("QUANTIDADE DO SEGUNDO PRODUTO: ");
        int QuantProdDois = ler.nextInt();
        System.out.printf("%2f%n PRECO DO SEGUNDO PRODUTO: ");
        double PrecoProdDois = ler.nextDouble();

        // Double CalculoProdUm = QuantProdUm * PrecoProdUm;
        // Double CalculoProdDois = QuantProdDois * PrecoProdDois;

        // Double ValorPagar = CauculoProdUm + CalculoProdDois;
        System.out.printf("");

        ler.close();


// aqui escrever a multiplicação entre quantidade do produto 1 e o seu preço. Depois quantidade do produto 1 e o seu preco. Depois a soma desses 2 resultados
// acredito que tenho que criar uma nova variável para o resultado de cada novo produto.
// preciso: filar um pouco no temas estilo de como fazem o cálculo, o que vem dps de scanner ler. Como normalmente se pede pra vc dar entrada nos produtos digitando no terminal. o printf formatacao na saída


        // System.out.println 
        // float ValorPagar 


    }
}