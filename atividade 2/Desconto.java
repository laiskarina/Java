import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o produto desejado: ");
        String prod = ler.nextLine();

        System.out.println("Qual o preco do produto: ");
        double price = ler.nextDouble();
        
        System.out.println("Qual o desconto do produto: ");
        int desconto = ler.nextInt();
        ler.nextLine();

        double DecimalValorDoDesconto = (desconto / 100);
        double ValorDoDesconto = (price * DecimalValorDoDesconto);
        double PrecoFinal = (price - ValorDoDesconto);



        System.out.println("---RECIBO---");
        System.out.println("Produto: " + prod);
        System.out.printf("Preco Original: %.2f%n", price);
        System.out.printf("Desconto: %.2f%n %d(", desconto, ")", ValorDoDesconto);
        System.out.printf("Preco Final: %.2f%n", PrecoFinal);




    }
}
