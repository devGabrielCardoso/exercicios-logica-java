//16) As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem
//compradas pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e
//escreva o custo total da compra.

package exerciciosFaccat;
import java.util.Scanner;
public class Exercicio16 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantas maças deseja adquirir?");
        int quantidade = leitor.nextInt();


        if (quantidade >= 12){
           int totalCompra = quantidade*1;
            System.out.println("Total a pagar: R$" + totalCompra);
        } else {
           float totalCompra = quantidade*1.30f;
            System.out.printf("Total a pagar: R$ %.2f", totalCompra);
        }

        leitor.close();
    }
}
