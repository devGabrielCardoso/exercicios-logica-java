//18) Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela
//poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).

package exerciciosFaccat;
import java.util.Scanner;
public class Exercicio18 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o ano em que você nasceu");
        int anoNascimento = leitor.nextInt();
        System.out.println("Informe o ano atual");
        int anoAtual= leitor.nextInt();


        int idade = anoAtual - anoNascimento;

        if (idade < 16){
            System.out.println("---------------------------");
            System.out.println("Idade: " + idade);
            System.out.println("Ainda não pode votar.");
            System.out.println("---------------------------");
        } else if (idade >= 16 && idade < 18){
            System.out.println("---------------------------");
            System.out.println("Idade: " + idade);
            System.out.println("Pode votar, mas não é obrigatório.");
            System.out.println("---------------------------");
        } else {
            System.out.println("---------------------------");
            System.out.println("Idade: " + idade);
            System.out.println("Obrigatório votar.");
            System.out.println("---------------------------");
        }

        leitor.close();

    }
}
