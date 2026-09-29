public class LacosDeRepeticao {

    public static void main(String[] args) {
        int x = 0;
        System.out.println("Começou");
        while (x < 10) {
            System.out.println("X: "+x);
            x = x + 1;
        }
        System.out.println("Acabou");

        x = 0;
        do { 
            System.out.println("Entrou no do-while");
            x++;
        } while (x < 10);
    }
    
}
 