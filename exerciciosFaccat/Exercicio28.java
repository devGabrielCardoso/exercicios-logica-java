//28) Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.

package exerciciosFaccat;
import java.util.Scanner;
public class Exercicio28 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe um número");
        int n1 = leitor.nextInt();
        System.out.println("Informe outro número");
        int n2 = leitor.nextInt();
        System.out.println("Informe um último número");
        int n3 = leitor.nextInt();

        if (n1 > n2 && n1 > n3){
            System.out.println(n1 + " é o maior número dos três.");
        } else if (n2 > n1 && n2 > n3){
            System.out.println(n2 + " é o maior número dos três.");
        } else {
            System.out.println(n3 + " é o maior número dos três.");
        }

        leitor.close();
    }
}
