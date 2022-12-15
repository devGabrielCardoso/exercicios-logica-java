// 19) Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles.

package exerciciosFaccat;
import java.util.Scanner;
public class Exercicio19 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número");
        int n1 = leitor.nextInt();
        System.out.println("Digite outro número");
        int n2 = leitor.nextInt();

        if (n1 > n2){
            System.out.println("---------------------------");
            System.out.println(n1 + " é maior que " + n2);
            System.out.println("---------------------------");
        } else {
            System.out.println("---------------------------");
            System.out.println(n2 + " é maior que " + n1);
            System.out.println("---------------------------");
        }

        leitor.close();
    }
}
