import java.io.IOException;
import java.util.Scanner;

public class Divisores1 {
    public static void main (String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        int N = ler.nextInt();

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                System.out.println(i);
            }
        }

        ler.close();
    }
}