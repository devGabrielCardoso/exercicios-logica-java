//20) Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.

package exerciciosFaccat;
import java.util.Scanner;
public class Exercicio20 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número");
        int n1 = leitor.nextInt();
        System.out.println("Digite outro número");
        int n2 = leitor.nextInt();

        if (n1 < n2){
            System.out.println("Ordem crescente: " + n1 + ", " + n2);
        } else {
            System.out.println("Ordem crescente: " + n2 + ", " + n1);
        }

        leitor.close();

    }
}
