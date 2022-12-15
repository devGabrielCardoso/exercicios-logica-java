package exerciciosFaccat;
import java.util.Scanner;
public class Exercicio15 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número");
        int numero = leitor.nextInt();

        if (numero >= 0 ){
            System.out.print("O número é positivo");
        } else {
            System.out.print("O número é negativo");
        }



    }
}
