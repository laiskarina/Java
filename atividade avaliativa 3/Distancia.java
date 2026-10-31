import java.io.IOException;
import java.util.Scanner;

public class Distancia {
    public static void main (String[] args) throws IOException {
        Scanner ler = new Scanner (System.in);

        System.out.println("DISTANCIA EM KM: ");
        int dist = ler.nextInt();
        int tempo = dist * 2;

        System.out.println(tempo + " minutos");
    }
}