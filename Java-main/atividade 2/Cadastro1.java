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

// criar um novo file para fazer essa task que inventei.
// fazer o if e else pro caso de saber se a pessoa fez aniverário ou ainda vai fazer e quantos anos fez. if tiver feito aniversário, printa uma mensagem dizendo que fez, else if printa uma tela que ainda vai completar. o programa deve calcular o mes de aniversário e data para saber se a pessoa fez ou ainda vai fazer.

//  um um scanner que pergunte que dia é hoje, scanner para ler do terminal o mes e dia e ano de aniversario do individuo,  2° etapa if e else if "int x", sendo int a data de aniversario da pessoa e mes. if x < y. sendo y o dia e mes de hoje. print" nao fez z anos de idade ainda", else if x > y "print voce já fez aniversario" x == y, ou if (x.equals(y)). print " parabens voce fez z anos de idade  hoje!!" 