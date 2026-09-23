import java.util.Scanner;

public class TesteEntrada {
    public static void main (String[] args){
        Scanner ler = new Scanner (System.in);

        System.out.print ("Digite o seu nome: ");
        String nome = ler.nextLine();

        System.out.print ("Digite sua idade: ");
        int idade = ler.nextInt();
        System.out.println ("Ola, " + nome + "! Voce tem " + idade + " anos" );

// O ideal é usar println é mais fácil do que printf, a saída é só por aspas "" entre o que é texto e somar com os nomes das variáveis
// fazendo concatenação: ("palvras" + variavel + "palavras" + variavel + "palavras" + ....);
// literalmente ("" + + "" + + "" + + "" + + ........), lembrar de dar espaço no final das palavras antes de concatenar e na última palavra dar espaço antes n depois da palavra.

 // Ou --> System.out.printf ("Ola, %s! Voce tem %d anos.%n", nome, idade);

        ler.close();
    }
}

// import java.util.Scanner; --> avisa ao java que vou usar Scanner, ler.next. Abaixo do public static void main devo declarar a Scanner que vou utilizar
// A Scanner ler = new Scanner (System.in); permite ler e responder no terminar a pergunta feita.
// O resto é prática, bons estudos.


//  preciso estudar classes, o que são? public class, static void main, Scanner...