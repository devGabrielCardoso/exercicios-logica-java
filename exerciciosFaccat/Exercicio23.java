

package exerciciosFaccat;
import java.util.Scanner;
public class Exercicio23 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);



        System.out.println("Informe seu nome");
        String nome = leitor.nextLine();
        System.out.println("Informe seu sexo, sendo 'M' ou 'F'");
        String sexo = leitor.nextLine();
        System.out.println("Informe sua altura");
        float altura = leitor.nextFloat();

        if(sexo == "M"){
            System.out.println("-----------------------");
            float pesoIdeal = (72.7f * altura) - 58;
            System.out.println("Olá, " + nome + "!");
            System.out.printf("Seu peso ideal é: %.2f kg %n", pesoIdeal);
            System.out.println("-----------------------");
        } else {
            System.out.println("-----------------------");
            float pesoIdeal = (62.1f * altura) - 44.7f;
            System.out.println("Olá, " + nome + "!");
            System.out.printf("Seu peso ideal é: %.2f kg %n", pesoIdeal);
            System.out.println("-----------------------");
        }

        leitor.close();

    }
}
