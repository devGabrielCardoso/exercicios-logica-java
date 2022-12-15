//29) Ler 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2
//maiores.

package exerciciosFaccat;
import java.util.Scanner;
public class Exercicio29 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe um número");
        int n1 = leitor.nextInt();
        System.out.println("Informe outro número");
        int n2 = leitor.nextInt();
        System.out.println("Informe um último número");
        int n3 = leitor.nextInt();

        if (n1 > n3 && n2 > n3){
            System.out.println("A soma entre os dois maiores números é: " + (n1+n2));
        } else if (n2 > n1 && n3 > n1){
            System.out.println("A soma entre os dois maiores números é: " + (n2+n3));
        } else {
            System.out.println("A soma entre os dois maiores números é: " + (n3+n1));
        }

        leitor.close();

    }
}
