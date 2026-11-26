import java.io.IOException;
import java.util.Locale; // Só escrevi assim pra ser aceito na plataforma 
import java.util.Scanner;

public class Salario {
    public static void main (String[] args) throws IOException {
        Locale.setDefault(Locale.US); // exigido ao puxar import java.util.Locale
        Scanner ler = new Scanner(System.in);

        int numero_funcionario = ler.nextInt();
        int horas_trabalhadas = ler.nextInt();
        double valor_horas = ler.nextDouble();
        double salario = (horas_trabalhadas * valor_horas);

        System.out.println("NUMBER = " + numero_funcionario);
        System.out.printf("SALARY = U$ %.2f%n", salario); //NUMBER, SALARY é exigido na plataforma ao invés de NUMERO, SALARIO

        ler.close();
    }
}