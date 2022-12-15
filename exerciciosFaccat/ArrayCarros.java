package exerciciosFaccat;
import java.util.Scanner;
public class ArrayCarros {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String[] carros = new String[10];

        System.out.println("Crie um array informando 10 carros abaixo");
        for(int i = 0; i < carros.length; i++){
            carros[i] = leitor.nextLine();
        }

        System.out.println("-------------");

        for (int i = 0; i < carros.length; i++){
            System.out.println(i + " - " + carros[i]);
        }

        leitor.close();

    }
}
