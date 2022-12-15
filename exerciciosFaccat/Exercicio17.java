//Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever
//uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o
//aluno é aprovado). Escrever também a média calculada.


package exerciciosFaccat;
import java.util.Scanner;
public class Exercicio17 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a notra da primeira avaliação");
        float nota1 = leitor.nextFloat();
        System.out.println("Informe a notra da segunda avaliação avaliação");
        float nota2 = leitor.nextFloat();

        float mediaFinal = (nota1+nota2)/2;

        if (mediaFinal >= 6){
            System.out.println("-----------------------------------");
            System.out.println("Media final: " + mediaFinal);
            System.out.println("Aprovado! =D");
            System.out.println("-----------------------------------");
        } else {
            System.out.println("-----------------------------------");
            System.out.println("Media final: " + mediaFinal);
            System.out.println("Reprovado! :(");
            System.out.println("-----------------------------------");
        }

        leitor.close();

    }
}
