
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
//  Existem vários tipos de equals, estudá-los na atividade 3
// o segundo caso que é equalsIgnoreCase() considera "iguais" strings que têm o mesmo conteúdo,
// mas com capitalização diferente. no caso o computador ele não sabe diferenciar que LAIS e lais
// são o mesmo conteúdo, então no equalsIgnoreCase solicito que desconsidere caixa alta "T" de caixa
// baixa "t".

