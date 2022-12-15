//24) Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que
//ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que
//ultrapassar este valor, calcular e escrever o seu salário total.

package exerciciosFaccat;
import java.util.Scanner;
public class Exercicio24 {
    public static void main(String[] args) {

       Scanner leitor = new Scanner(System.in);

        System.out.println("Informe seu salário fixo");
        float salarioFixo = leitor.nextFloat();
        System.out.println("Informe a quantia feita em vendas no mês");
        float totalVendas = leitor.nextFloat();

        if (totalVendas <= 1500){
            float comissaoVendas = totalVendas*0.03f;
            float salarioTotal = salarioFixo+comissaoVendas;
            System.out.println("-------------------------------------");
            System.out.println("Comissão em vendas (3%): R$" +  comissaoVendas);
            System.out.println("Salário total no final do mês: R$" + salarioTotal);
            System.out.println("-------------------------------------");
        } else {
            float comissaoVendas = totalVendas*0.05f;
            float salarioTotal = salarioFixo+comissaoVendas;
            System.out.println("-------------------------------------");
            System.out.println("Comissão em vendas (5%): R$" +  comissaoVendas);
            System.out.println("Salário total no final do mês: R$" + salarioTotal);
            System.out.println("-------------------------------------");
        }

        leitor.close();

    }
}
