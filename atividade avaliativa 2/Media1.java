import java.io.IOException;
import java.util.Scanner;

public class Media1 {
    public static void main (String[] args) throws IOException {
        Scanner ler = new Scanner (System.in);

            double A = ler.nextDouble();

            double B = ler.nextDouble();

            double MEDIA_A = (A * 3.5);
            double MEDIA_B = (B * 7.5);
            double MEDIA = (MEDIA_A + MEDIA_B) / 11.0; // 11.0 é pq o valor é dividido pela soma dos pesos.
            System.out.printf("MEDIA = %.5f%n", MEDIA );

        ler.close();
    }
}