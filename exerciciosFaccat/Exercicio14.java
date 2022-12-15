package exerciciosFaccat;
import java.util.Scanner;
public class Exercicio14 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número qualquer");
        int numero = leitor.nextInt();

        if(numero < 10){
            System.out.println("É menor que 10.");
        } else {
            System.out.println("É maior que 10");
        }
    }
}
