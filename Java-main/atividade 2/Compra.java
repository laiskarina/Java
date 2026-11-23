import java.util.Scanner;

public class Compra {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Qual produto deseja comprar: ");
        String prod = ler.nextLine();
        System.out.println("Qual o valor unitario do produto: ");
        double PricePerUnit = ler.nextDouble();
        System.out.println("Digite a quantidade almejada do produto: ");
        int qntd = ler.nextInt();
        ler.nextLine();

        double ValorTotal = (PricePerUnit * qntd);

        System.out.printf("%d X %s = %.2f%n", qntd, prod, ValorTotal);

        ler.close();
    }
}
