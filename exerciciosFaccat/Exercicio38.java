package exerciciosFaccat;
import java.util.Scanner;
public class Exercicio38 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        var usuario = 1234;
        var senha = 9999;

        System.out.println("Informe o usuário");
        int tentativaUsuario = leitor.nextInt();

        if (tentativaUsuario == usuario){
            System.out.println("Informe a senha");
            int tentativaSenha = leitor.nextInt();

            if (tentativaSenha == senha){
                System.out.println("------------------");
                System.out.println("Login efetuado com sucesso!");
                System.out.println("------------------");
            } else {
                System.out.println("------------------");
                System.out.println("Senha inválida");
                System.out.println("------------------");
            }

        } else {
            System.out.println("------------------");
            System.out.println("Usuário inválido");
            System.out.println("------------------");
        }

        leitor.close();
    }
}
