package exerciciosFaccat;
import java.util.Scanner;
public class CustoCarroNovo {
    public static void main(String[]args){

        Scanner leitor = new Scanner(System.in);

        float perDistribuidora = 0.28f;
        float perImposto = 0.45f;


        System.out.println("Informe o custo de fábrica do carro");
        int custoFabrica = leitor.nextInt();
        float precoFinal =  custoFabrica + (custoFabrica * perDistribuidora) + (custoFabrica * perImposto);
        System.out.println("----------------------------");
        System.out.println("+28% DA DISTRIBUIDORA");
        System.out.println("+45% DE IMPOSTO");
        System.out.println("----------------------------");
        System.out.println("Preço final do carro com impostos fica: R$" + precoFinal);
        leitor.close();

    }

}
