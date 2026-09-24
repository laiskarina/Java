
import java.util.Scanner;

public class TextoLimpoDoUsuario {
    public static void main (String[] args) {
        Scanner ler = new Scanner (System.in);

        System.out.print ("Digite sim: ");
        String resposta = ler.nextLine();

        if (resposta.trim().equalsIgnoreCase("sim")) { // aceita "sim", "SIM", "Sim", " SIM ", " sim ", "sIM"...
            System.out.print ("Voce confirmou sua presenca!");
        }
        else {
            System.out.print ("Poxa, que pena! Te esperamos numa proxima.");
        }
        ler.close();
    }
}