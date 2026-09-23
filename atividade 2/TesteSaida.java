public class TesteSaida {
    public static void main (String[] args){
        System.out.println ("LINHA A");
        System.out.println ("LINHA B");

        System.out.print ("LINHA C");
        System.out.print ("LINHA D");

        System.out.printf ("%n");
        System.out.printf ("LINHA E %n");
        System.out.printf ("%.2f%n", 7.5);
        System.out.printf ("%s tem %d anos %n", "Ana", 20);
    }
}
// printn --> printline quebra linha, veja no exemplo 1
// print --> não quebra linha a escrita sai grudada, veja no exemplo 2 quando der o run

// O printf é sempre nescessário no uso de número decimal (número racional (Q)), porque utilizando: %.2f --> cria um 7,50 ao invés de 7.5 veja no exemplo 3
// No printf deve-se usar: %n --> para quebrar linha.