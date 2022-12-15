package exerciciosFaccat;
import java.util.Scanner;


public class ComissaoSalarioCarros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o salário fixo");
        int salarioFixo = leitor.nextInt();
        System.out.println("Número de carros vendidos no mês");
        int qtdCarrosVendidos = leitor.nextInt();
        System.out.println("Informe o valor unitário de cada carro");
        int valorCarro = leitor.nextInt();


         int totalEmVendas = qtdCarrosVendidos*valorCarro;

        //Comissão de 5% no total de vendas feitas no mês
         float comissaoVendasTotais = totalEmVendas*0.05f;

        //Comissão de 3% por cada venda efetuada
         float comissaoVendaUnitaria = valorCarro*0.03f;

         //Salário final
        float salarioFinal = salarioFixo + comissaoVendasTotais + (comissaoVendaUnitaria*qtdCarrosVendidos);


         System.out.println("------------- Holerite -------------");
         System.out.println("Salário fixo: R$" + salarioFixo);
         System.out.println("Quantidade de carros vendidos no no mês: " + qtdCarrosVendidos);
         System.out.println("Preço de cada carro: R$" + valorCarro);
         System.out.println("Comissão por cada carro vendido (3%): R$" + comissaoVendaUnitaria);
         System.out.println("Comissão no total de vendas efetuadas no mês (5%): R$" + comissaoVendasTotais);
        System.out.println("Salário total no mês: R$" + salarioFinal);
        System.out.println("--------------------------------------");

        leitor.close();

    }
}


/*
Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas vendas,
o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do vendedor.

*/