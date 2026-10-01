public class LacosDeRepeticao {

    //O WHILE

    public static void main(String[] args) {
        int x = 0;
        System.out.println("Comecou");
        while (x < 10) {
            System.out.println("X: "+ x);
            x = x + 1;
        }
        System.out.println("Acabou");

    // O DO WHILE --> Executa o bloco primeiro e só depois testa a condição
        x = 0; //Renicia x para 10 dps de ter ido do 0 ao 9
        do {
            System.out.println("Entrou no do-while");
            x++;
        } while (x < 10);
    }
    
}