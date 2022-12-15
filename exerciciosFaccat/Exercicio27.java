//27) Ler um valor e escrever se é positivo, negativo ou zero.

package exerciciosFaccat;
import java.util.Scanner;
public class Exercicio27 {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número");
        int numero = leitor.nextInt();

        if(numero > 0){
            System.out.println("O número informado é positivo");
        } else if (numero == 0){
            System.out.println("O número é igual a zero");
        } else {
            System.out.println("O número informado é negativo");
        }

        leitor.close();
    }
}
