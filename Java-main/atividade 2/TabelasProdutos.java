import java.util.Scanner;

public class TabelasProdutos {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println ("Me diga qual produto voce quer levar: ");
        String prod = ler.nextLine();
        System.out.println ("Me diga o 2° produto que deseja levar: ");
        String prod2 = ler. nextLine();
        System.out.println ("Me informe o 3° e ultimo produto desejado: ");
        String prod3 = ler.nextLine();

        System.out.println("Me informe o valor unitario do primeiro produto: ");
        double PricePerUnit = ler.nextDouble();
        System.out.println("Me informe o valor unitario do 2° produto: ");
        double PricePerUnit2 = ler.nextDouble();
        System.out.println("Me informe o valor do 3° produto: ");
        double PricePerUnit3 = ler.nextDouble();

        System.out.println("Qual a quantidade almejada do produto: ");
        int qntd = ler.nextInt();
        ler.nextLine();
        System.out.println("Qual a quantidade almejada do produto: ");
        int qntd2 = ler.nextInt();
        ler.nextLine();
        System.out.println("Qual a quantidade almejada do produto: ");
        int qntd3 = ler.nextInt();
        ler.nextLine();

        double ValorTotal = (PricePerUnit * qntd);
        double ValorTotal2 = (PricePerUnit2 * qntd2);
        double ValorTotal3 = (PricePerUnit3 * qntd3);

        double TotalPagar = (ValorTotal + ValorTotal2 + ValorTotal3);

        System.out.println("PROD                    QNTD     UNIT     TOTAL");
        System.out.printf("%-20s %5d %10.2f %10.2f%n", prod, qntd, PricePerUnit, ValorTotal);
        System.out.printf("%-20s %5d %10.2f %10.2f%n", prod2,qntd2, PricePerUnit2, ValorTotal2);
        System.out.printf("%-20s %5d %10.2f %10.2f%n", prod3, qntd3, PricePerUnit3, ValorTotal3);
        System.out.println("------------------------------------------------");
        System.out.printf("Total a pagar: %22.2f", TotalPagar);

        // prod, qntd, valor unitario, valortotal
        // total a pagar

    }    
}
