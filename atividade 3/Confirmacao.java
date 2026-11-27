import java.util.Scanner;

public class Confirmacao {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Deseja continuar? (sim/nao): ");
    
        String resposta = ler.nextLine();

        if (resposta.trim().equalsIgnoreCase("sim") || resposta.trim().equalsIgnoreCase("s") || resposta.equalsIgnoreCase("ss")) {
            System.out.println("Voce continua");
        } else if (resposta.trim().equalsIgnoreCase("nao") || resposta.trim().equalsIgnoreCase("n") || resposta.trim().equalsIgnoreCase("nn"))  {
            System.out.println("Voce nao prossegue");
        } else {
            System.out.println("Resposta nao reconhecida: [" + resposta + "]");
        }
    }
}

// observação sobre esse "||", ele equivale a condição. if (condicao1 || condicao2) { -> atribui o "if" para mais de uma condição estar devidamente correto".