import java.util.Scanner;

public class Cadastro1 {
    public static void main (String[] args){
        Scanner ler = new Scanner (System.in);

        System.out.println("Digite o seu nome: ");
        String nome = ler.nextLine();

        System.out.println("Qual a sua cidade: ");
        String cidade = ler.nextLine();

        System.out.println("Ano de nascimento: ");
        int ano = ler.nextInt();
        ler.nextLine();

        System.out.println("Nome: " + nome);
        System.out.println("Cidade: " + cidade);
        System.out.println("Idade: " + ano);

        int idade = (2026 - ano);
        System.out.println(nome + " fez ou ainda vai fazer " + idade + " anos de idade em 2026!");

        ler.close();
    }
}

