package exerciciosFaccat;
import java.util.Scanner;
public class ArrayBoolean {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Boolean[] logicos = new Boolean[10];

        System.out.println("Crie um array informando 10 true ou false abaixo");

        for (int i = 0; i < logicos.length; i++){
            logicos[i] = leitor.nextBoolean();
        }

        System.out.println("----------------");

        for (int i = 0; i < logicos.length; i++){
            System.out.println(i + " - " + logicos[i]);
        }

        leitor.close();

    }
}
