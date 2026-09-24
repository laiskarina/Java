
import java.util.Scanner;

public class TesteIgualdade2 {
    public static void main (String[] args) {
        Scanner ler = new Scanner (System.in);

        System.out.print ("Digite a palavra java: ");
        String digitada = ler.nextLine();

        System.out.println ("Com =.....:" + (digitada == "java"));
        System.out.println ("Com equals ...:" + digitada.equals("java"));

        ler.close();
    }
}