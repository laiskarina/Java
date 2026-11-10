import java.io.IOException;
import java.util.Scanner;

public class Sedex {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        int N = ler.nextInt();
        int A = ler.nextInt();
        int L = ler.nextInt();
        int P = ler.nextInt();

        if (N <= A && N <= L && N <= P) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }

        ler.close();
    }
}