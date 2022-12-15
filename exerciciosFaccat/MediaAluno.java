package exerciciosFaccat;
import java.util.Scanner;
public class MediaAluno {
    public static void main(String[]args){
        Scanner leitor = new Scanner(System.in);

        float n1, n2, n3;

        System.out.println("Informe a nota da primeira avaliação");
        n1 = leitor.nextFloat();
        System.out.println("Informe a nota da segunda avaliação");
        n2 = leitor.nextFloat();
        System.out.println("Informe a nota da terceira avaliação");
        n3 = leitor.nextFloat();

        float mediaFinal = ((n1*2) + (n2*3) + (n3*5))/10;

        System.out.println("Media final: " + mediaFinal);

        leitor.close();
    }
}
