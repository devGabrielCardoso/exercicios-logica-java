//26) Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e
//quantidade mínima em estoque de um produto. Calcular e escrever a quantidade média ((quantidade
//média = quantidade máxima + quantidade mínima)/2). Se a quantidade em estoque for maior ou igual
//a quantidade média escrever a mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar
//compra'.
package exerciciosFaccat;
import java.util.Scanner;
public class Exercicio26 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a quantidade disponível no estoque");
        int quantidadeDisponivel = leitor.nextInt();
        System.out.println("Informe a quantidade mínima necessário");
        int quantidadeMin = leitor.nextInt();
        System.out.println("Informe a quantidade máxima permitida");
        int quantidadeMax = leitor.nextInt();

        int quantidadeMedia = (quantidadeMax + quantidadeMin)/ 2;

        if (quantidadeDisponivel >= quantidadeMedia) {
            System.out.println("------------------------");
            System.out.println("Estoque atual: " + quantidadeDisponivel);
            System.out.println("Quantidade mínima necessária: " + quantidadeMedia);
            System.out.println("Não é necessário fazer reposição");
            System.out.println("------------------------");
        } else {
            System.out.println("------------------------");
            System.out.println("Estoque atual: " + quantidadeDisponivel);
            System.out.println("Quantidade mínima necessária: " + quantidadeMedia);
            System.out.println("Necessário fazer reposição");
            System.out.println("------------------------");
        }

        leitor.close();
    }
}
