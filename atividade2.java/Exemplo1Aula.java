
public class Exemplo1Aula {
    public static void main(String[] args) {
        String numero1 = "Teste";
        String numero2 = "Teste";

        if (numero1.equals(numero2)) {
            System.out.println("Strings iguais!");
        } else {
            System.out.println("Strings diferentes!");
        }

        if (numero1.equalsIgnoreCase(numero2)) {
            System.out.println("Strings iguais desconsiderando caixa alta e caixa baixa!");
        } else {
            System.out.println("Strings diferentes!");
        }
    }
}
 