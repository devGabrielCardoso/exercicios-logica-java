//22) A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais
//de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%.
//Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva
//o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas
//(considere que o mês possua 4 semanas exatas).

package exerciciosFaccat;
import java.util.Scanner;
public class Exercicio22 {
    public static void main(String[] args) {

        Scanner leitor  = new Scanner(System.in);

        System.out.println("Informe o total de horas trabalhadas no mês");
        int horasTrabalhadas = leitor.nextInt();
        System.out.println("Informe o salário por hora");
        int salarioHora = leitor.nextInt();

        if (horasTrabalhadas > 160){
            int horasExtras = horasTrabalhadas-160;
            float salarioExtra = (horasExtras*salarioHora)*0.5f;
            float salarioFinal = (salarioHora*horasTrabalhadas) + salarioExtra;
            System.out.println("----------------------------------------");
            System.out.println("Horas trabalhadas no mês: " + horasTrabalhadas + "h");
            System.out.println("Salário por hora R$: " + salarioHora);
            System.out.println("Horas extras no mês: " + horasExtras + "h");
            System.out.println("Total ganho extras: R$" + salarioExtra);
            System.out.println("Salário total: R$" + salarioFinal);
            System.out.println("----------------------------------------");
        } else {
            float salarioFinal = salarioHora*horasTrabalhadas;
            System.out.println("----------------------------------------");
            System.out.println("Horas trabalhadas no mês: " + horasTrabalhadas + "h");
            System.out.println("Salário por hora R$: " + salarioHora);
            System.out.println("Salário total: R$" + salarioFinal);
            System.out.println("----------------------------------------");
        }
        leitor.close();
    }
}
