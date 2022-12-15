package exerciciosFaccat;
import java.util.Scanner;
public class ArrayForEach {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] numeros = {4, 10, 3, 6, 42, 92, 3};

        for (int i : numeros){
            System.out.println(i);
        }

    }
}
