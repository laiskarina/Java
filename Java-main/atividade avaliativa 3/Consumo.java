import java.io.IOException;
import java.util.Scanner;

public class Consumo {
    public static void main (String[] args) throws IOException {
        Scanner ler = new Scanner (System.in);

        System.out.println("DISTANCIA PERCORRIDA EM KM: ");
        int x = ler.nextInt();

        System.out.println("COMBUSTIVEL GASTO EM LITROS: "); 
        double y = ler.nextDouble();

        double ConsumoMedio = x / y;
        System.out.printf("CONSUMO MEDIO: %.3f%s%n", ConsumoMedio, " km/l");

        ler.close();
    }
}