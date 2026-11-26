import java.util.Scanner;

public class FallThrough {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Que dia da semana é hoje?");
        System.out.println("1 -- Domingo");
        System.out.println("2 -- Segunda");
        System.out.println("3 -- Terca");
        System.out.println("4 -- Quarta");
        System.out.println("5 -- Quinta");
        System.out.println("6 -- Sexta");
        System.out.println("7 -- Sabado");
        System.out.println("Digite a opcao entre 1 a 7: ");      

        int dia = ler.nextInt();
        ler.nextLine();

        switch (dia) {
            case 1:
            case 7:
                System.out.println("Fim de Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Util");
            default:
                System.out.println("Informacao Invalida");      
        }
    
        ler.close();
    }
}