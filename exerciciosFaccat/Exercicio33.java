//33) Ler dois valores e imprimir uma das três mensagens a seguir:
//‘Números iguais’, caso os números sejam iguais
//‘Primeiro é maior’, caso o primeiro seja maior que o segundo;
//‘Segundo maior’, caso o segundo seja maior que o primeiro.

package exerciciosFaccat;
import java.util.Scanner;
public class Exercicio33 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);


        System.out.println("Informe um número");
        int n1 = leitor.nextInt();
        System.out.println("Informe outro número");
        int n2 = leitor.nextInt();

        if (n1 > n2 ){
            System.out.println(n1 + " é maior que " + n2);
        } else if (n2 == n1){
            System.out.println("Números iguais.");
        } else {
            System.out.println(n2 + " é maior que " + n1);
        }


    }
}
