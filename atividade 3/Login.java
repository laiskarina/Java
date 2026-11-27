import java.util.Scanner;

public class Login {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o seu nome de usuario: ");
        String usuario = ler.nextLine();

        System.out.println("Digite sua senha");
        String senha = ler.nextLine();

        if (usuario.trim().equalsIgnoreCase("admin")) {
        } else {
            System.out.println("Usuario ou senha invalida");
        }

        if (senha.trim().equals("unicap2026")) {
        } else {
            System.out.println("usuario ou senha invalida");
        }

        ler.close();
    }
}
