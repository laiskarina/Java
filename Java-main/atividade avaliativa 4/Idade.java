import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class Idade {
    public static void main (String[] args) throws IOException {
        Scanner ler = new Scanner (System.in);

        int soma = 0;
        int contador = 0;
        int idade = ler.nextInt();

        while (idade >= 0) {
            soma = soma + idade;
            contador = contador + 1;
            idade = ler.nextInt();
        }

        double media = (double) soma / contador;
        System.out.printf(Locale.US, "%.2f%n", media);

        ler.close();

    }
}

