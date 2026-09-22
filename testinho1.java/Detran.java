import java.util.Scanner;

public class Detran {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("VOCE FOI PEGO NO TESTE!!!!!!");
        System.out.println("digite seu nome");
        String nome = sc.nextLine();
        System.out.println("digite sua idade:");
        int idade = sc.nextInt();


        if(idade >= 18){
            System.out.println(nome + " voce foi liberado");
        } else if(idade == 18){
            System.out.println(nome + " voce vai apanhar pesado");
        } else if( idade < 16){
            System.out.println("voce endoidou");
        }




    }
}