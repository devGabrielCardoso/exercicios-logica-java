package exerciciosFaccat;
import java.util.Scanner;
public class ArrayPessoas {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String[] pessoas = new String[10];

        System.out.println("Crie um array adicionando 10 nomes abaixo: ");
        for (int i = 0; i < pessoas.length; i++){
            pessoas[i] = leitor.nextLine();
        }

        System.out.println("-------------------");

        for (int i = 0; i < pessoas.length; i++){
            System.out.println(i + " - " + pessoas[i]);
        }

        leitor.close();
    }
}
