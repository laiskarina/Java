import java.util.Scanner;

public class ComparacaoDeNomes {
    public static void main (String[] args){
        Scanner ler = new Scanner (System.in);

        System.out.print ("digite um nome: ");
        String nome1 = ler.nextLine();

        System.out.print ("digite outro nome: ");
        String nome2 = ler.nextLine();

        if ((nome1.trim().compareTo(nome2)) < 0) {
            System.out.print (nome1 + " vem primeiro!");
        }
        else if ((nome2.trim().compareTo(nome1)) > 0) {
            System.out.print (nome2 + " vem primeiro!");
        }
        else {
            System.out.print ("Os nomes sao iguais!");
        }
        ler.close();
    }
}