//25) Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e
//escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior
//ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.
package exerciciosFaccat;
import java.util.Scanner;
public class Exercicio25 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o número da conta");
        int numeroConta = leitor.nextInt();
        System.out.println("Saldo atual");
        float saldoAtual = leitor.nextFloat();
        System.out.println("Débito pendente");
        float debitoPendente = leitor.nextFloat();
        System.out.println("Crédito disponível");
        float creditoDisponivel = leitor.nextFloat();

        float saldoFinal = saldoAtual - debitoPendente + creditoDisponivel;

        if (saldoFinal >= 0){
            System.out.println("-------------------------");
            System.out.println("Conta: " + numeroConta);
            System.out.println("Saldo atual: R$" + saldoFinal);
            System.out.println("Saldo positivo!");
            System.out.println("-------------------------");
        } else {
            System.out.println("-------------------------");
            System.out.println("Conta: " + numeroConta);
            System.out.println("Saldo atual: R$" + saldoFinal);
            System.out.println("Saldo negativo! :(");
            System.out.println("-------------------------");
        }


        leitor.close();
    }
}
