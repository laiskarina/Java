public class Do_DoWhile {
    public static void main (String[] args) {
        
        int x = 100; 
            while (x < 10) {
            System.out.println ("X: " + x);
            x = x + 1;
        }
        // o while não executa nenhuma vez se a condição for falsa.

        x = 100;
        do {
            System.out.println("Entrou no do-while");
            x++;
        } while ( x < 10 );
        // o do-while executa ao menos 1x independente se a condição for falsa. 
        // No terminal somente a informação do do-while apareceu, porque a condição fornecida é falsa, então só ele executou uma vez. Enquanto ao while que foi posto lá em cima nenhuma.
    }
}

