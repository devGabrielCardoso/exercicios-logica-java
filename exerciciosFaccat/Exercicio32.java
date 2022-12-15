//32) Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o nome
//do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE.

package exerciciosFaccat;
import java.util.Scanner;
public class Exercicio32 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Time da casa: ");
        String timeA = leitor.nextLine();
        System.out.println("Time visitante: ");
        String timeB = leitor.nextLine();
        System.out.println("-----------------------");
        System.out.println("Gols do " + timeA + ":");
        int golsA = leitor.nextInt();
        System.out.println("Gols do " + timeB + ":");
        int golsB = leitor.nextInt();

        if (golsA > golsB){
            System.out.println("-----------------------");
            System.out.println("Placar: " + timeA + " " + golsA + "x" +  golsB + " " + timeB);
            System.out.println(timeA + " ganhou a partida.");
            System.out.println("-----------------------");
        } else if (golsA == golsB){
            System.out.println("-----------------------");
            System.out.println("Placar: " + timeA + " " + golsA + "x" +  golsB + " " + timeB);
            System.out.println("Empate");
            System.out.println("-----------------------");
        } else {
            System.out.println("-----------------------");
            System.out.println("Placar: " + timeB + " " + golsB + "x" +  golsA + " " + timeA);
            System.out.println(timeB + " ganhou a partida.");
            System.out.println("-----------------------");
        }


    }
}
