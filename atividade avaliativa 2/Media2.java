import java.io.IOException;
import java.util.Scanner;

public class Media2 {
    public static void main (String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        double A = ler.nextDouble();
        double B = ler.nextDouble();
        double C = ler.nextDouble();

        double MEDIA_A = (A * 2);
        double MEDIA_B = (B * 3);
        double MEDIA_C = (C * 5);

        double MEDIA = (MEDIA_A + MEDIA_B + MEDIA_C) / 10;
        System.out.printf("MEDIA = %.1f%n", MEDIA);

    ler.close();
    }
}