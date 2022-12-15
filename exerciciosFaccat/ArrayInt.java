package exerciciosFaccat;
import java.util.Scanner;
public class ArrayInt {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int Carros[] = new int[10];

        System.out.println("Crie um array informando 10 números abaixo");

        for (int i = 0; i < Carros.length; i++){
            Carros[i] = leitor.nextInt();
        }

        System.out.println("----------------");

        for (int i = 0; i < Carros.length; i++){
            System.out.println(i + " - " + Carros[i]);
        }

        leitor.close();


    }
}
