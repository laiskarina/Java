import java.util.Scanner;

public class ConversorTemperatura {
    public static void main (String[] args){
        Scanner ler = new Scanner (System.in);

        String msg = "";

        System.out.println("Aluna: Lais Karina Gonzaga de Lima");
        System.out.println("Matricula: 00000866312");

        System.out.println("");

        System.out.print("Digite a temperatura em celsius: ");
        float celsius = ler.nextFloat();

        float fahrenheit = celsius * 9/5 + 32;

        if (celsius < 0) {
            msg = "CONGELADO!";
        } else if (celsius >= 0 && celsius < 15) {
            msg = "FRIO!";
        } else if (celsius >= 15 && celsius < 25) {
            msg = "AGRADAVEL!";
        } else if (celsius >= 25) {
            msg = "QUENTE!";
        }

        System.out.printf("fahrenheit: %.1f \nClassificacao: %s", fahrenheit, msg);

        ler.close();
    }
}