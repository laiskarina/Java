public class TesteFor {
    public static void main (String[] args){
        System.out.println("--- COM WHILE ---");
        int x = 0;
        while (x < 10) { // tem que abrir chaves na condição
            System.out.println ("X: " + x);
            x = x + 1;
        }

        System.out.println("--- COM FOR ---");
        for (int i = 0; i < 10; i++) { // tem que abrir chaves na condição
            System.out.println ("I: " + i);
        }
    }
}