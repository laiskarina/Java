import java.util.Scanner;

public class Armadilha {
    public static void main (String[] args) {
        Scanner ler = new Scanner (System.in);

        System.out.print("Quantidade: ");
        int qtd = ler.nextInt();
        ler.nextLine(); 

        System.out.print ("Nome do produto: ");
        String produto = ler.nextLine();

        System.out.println ("Voce comprou " + qtd + " unidades de" + produto);

        ler.close();
    }
}

// sempre que você usar nextInt ou nextDouble, depois precisa acrescentar um nextLine. Caso contrário não vai pegar a 2° informação, que no caso do meu exemplo é o nome do
// produto. o ler.nextLine(); simplesmente limpa o enter que sobrou.