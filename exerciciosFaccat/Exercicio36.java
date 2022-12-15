// 36) Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres (considere que as idades
//dos homens serão sempre diferentes entre si, bem como as das mulheres). Calcule e escreva a soma
//das idades do homem mais velho com a mulher mais nova, e o produto das idades do homem mais
//novo com a mulher mais velha.


package exerciciosFaccat;
import java.util.Scanner;
public class Exercicio36 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a idade da Amanda");
        int Amanda = leitor.nextInt();
        System.out.println("Informe a idade da Julia");
        int Julia = leitor.nextInt();
        System.out.println("Informe a idade do Gabriel");
        int Gabriel = leitor.nextInt();
        System.out.println("Informe a idade do Henrique");
        int Henrique = leitor.nextInt();


        if (Gabriel > Henrique && Julia < Amanda){
            int soma = Gabriel + Julia;
            int produto = Henrique * Amanda;
            System.out.println("Soma das idades do homem mais velho com a mulher mais nova: " + soma);
            System.out.println("Produto das idades do homem mais novo com a mulher mais velha: " + produto);
        } else if (Henrique > Gabriel && Amanda < Julia){
            int soma = Henrique + Amanda;
            int produto = Gabriel * Julia;
            System.out.println("Soma das idades do homem mais velho com a mulher mais nova: " + soma);
            System.out.println("Produto das idades do homem mais novo com a mulher mais velha: " + produto);
        } else if (Henrique > Gabriel && Julia < Amanda){
            int soma = Henrique + Julia;
            int produto = Gabriel * Amanda;
            System.out.println("Soma das idades do homem mais velho com a mulher mais nova: " + soma);
            System.out.println("Produto das idades do homem mais novo com a mulher mais velha: " + produto);
        } else {
            int soma = Gabriel + Amanda;
            int produto = Henrique * Julia;
            System.out.println("Soma das idades do homem mais velho com a mulher mais nova: " + soma);
            System.out.println("Produto das idades do homem mais novo com a mulher mais velha: " + produto);
        }

        leitor.close();

    }
}
