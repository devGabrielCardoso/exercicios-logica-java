// 30) Ler 3 valores (considere que não serão informados valores iguais) e escrevê-los em ordem
//crescente.

package exerciciosFaccat;
import java.util.Scanner;
public class Exercicio30 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe um número");
        int n1 = leitor.nextInt();
        System.out.println("Informe outro número");
        int n2 = leitor.nextInt();
        System.out.println("Informe um último número");
        int n3 = leitor.nextInt();

        if (n1 < n2 && n1 < n3 && n2 < n3 && n2 > n1) {
            System.out.println("Ordem crescente: " + n1 + ", " + n2 + ", " + n3);
        } else if (n2 < n1 && n2 < n3 && n1 > n2 && n1 < n3){
            System.out.println("Ordem crescente: " + n2 + ", " + n1 + ", " + n3);
        } else if (n3 < n1 && n3 < n2 && n1 > n3 && n1 < n2) {
            System.out.println("Ordem crescente: " + n3 + ", " + n1 + ", " + n2);
        } else if (n2 < n1 && n2 < n3 && n3 > n2 && n3 < n1){
            System.out.println("Ordem crescente: " + n2 + ", " + n3 + ", " + n1);
        } else if (n1 < n2 && n1 < n3 && n3 > n1 && n3 < n2){
            System.out.println("Ordem crescente: " + n1 + ", " + n3 + ", " + n2);
        } else {
            System.out.println("Ordem crescente: " + n3 + ", " + n2 + ", " + n1);
        }

        leitor.close();

    }
}
