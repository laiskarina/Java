import java.util.Scanner;

public class MenuSwitch {
    public static void main (String[] args) {
        Scanner ler = new Scanner (System.in);

        System.out.println ("1 - Cadastrar");
        System.out.println ("2 - Consultar");
        System.out.println ("1 - Alterar");
        System.out.println ("Escolha: ");
        int opcao = ler.nextInt();
        ler.nextLine();

        switch (opcao) {
            case 1:
                System.out.println("Cadastrar");
                break;
            case 2:
                System.out.println("Consultar");
                break;
            case 3:
                System.out.println("Alterar");
                break;
            default:
                System.out.println ("Opcao Invalida");
        }

        ler.close();
    }
}