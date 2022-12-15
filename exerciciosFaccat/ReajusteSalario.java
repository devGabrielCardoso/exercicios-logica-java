package exerciciosFaccat;
import java.util.Scanner;
public class ReajusteSalario {
    public static void main(String[]args){

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o salário fixo");
        int salarioFixo = leitor.nextInt();
        System.out.println("Informe quanto de reajuste (%) será adicionado");
        float reajuste = leitor.nextFloat();

        float salarioFinal = salarioFixo + (salarioFixo*(reajuste/100));

        System.out.println("O salário final com reajuste ficará: R$"  + salarioFinal);

        leitor.close();

    }
}
