import java.util.Scanner;

public class OrdemAfalbetica {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um nome: ");
        String nome1 = ler.nextLine().trim();

        System.out.println ("Digite outro nome: ");
        String nome2 = ler.nextLine().trim();

        if (nome1.compareToIgnoreCase(nome2) < 0) {
            System.out.println(nome1 + " vem primeiro");
        } else if (nome1.compareToIgnoreCase(nome2) > 0) {
            System.out.println(nome2 + " vem primeiro");
        } else {
            System.out.println("Nomes iguais, informe o sobrenome.");
        }
    }
}
