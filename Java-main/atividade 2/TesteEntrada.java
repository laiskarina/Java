import java.util.Scanner;

public class TesteEntrada {
    public static void main (String[] args){
        Scanner ler = new Scanner (System.in);

        System.out.print ("Digite o seu nome: ");
        String nome = ler.nextLine();

        System.out.print ("Digite sua idade: ");
        int idade = ler.nextInt();
        System.out.println ("Ola, " + nome + "! Voce tem " + idade + " anos" );

        ler.close();
    }
}