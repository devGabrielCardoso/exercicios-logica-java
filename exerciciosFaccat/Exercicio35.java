// 35) Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível, calcule e imprima o valor a ser pago pelo cliente sabendo-se
//que o preço do litro da gasolina é R$ 3,30 e o preço do litro do álcool é R$ 2,90.

package exerciciosFaccat;
import java.util.Scanner;
public class Exercicio35 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Bem-vindo ao posto de gasolina");
        System.out.println("Escolha um tipo de combustivel | 1 - Gasolina | 2 - Álcool");
        int escolha = leitor.nextInt();

        switch (escolha) {
            case 1 -> {
                System.out.println("Quantos litros de gasolina gostaria de colocar?");
                int litrosGasolina = leitor.nextInt();
                if (litrosGasolina <= 20) {
                    var valorGasolina = (litrosGasolina * 3.30) - (litrosGasolina * 0.04);
                    System.out.println("Total a pagar (desconto de 4%): R$" + valorGasolina);
                } else {
                    var valorGasolina = (litrosGasolina * 3.30) - (litrosGasolina * 0.06);
                    System.out.println("Total a pagar (desconto de 6%): R$" + valorGasolina);
                }
            }
            case 2 -> {
                System.out.println("Quantos litros de álcool gostaria de colocar?");
                int litrosAlcool = leitor.nextInt();
                if (litrosAlcool <= 20) {
                    var valorAlcool = (litrosAlcool * 2.90) - (litrosAlcool * 0.03);
                    System.out.println("Total a pagar (desconto de 3%): R$" + valorAlcool);
                } else {
                    var valorAlcool = (litrosAlcool * 2.90) - (litrosAlcool * 0.05);
                    System.out.println("Total a pagar (desconto de 5%): R$" + valorAlcool);
                }
            }
        }

        leitor.close();
    }
}
