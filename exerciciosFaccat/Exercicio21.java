//21) Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os
//minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é
//de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.

package exerciciosFaccat;
import java.util.Scanner;
public class Exercicio21 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        System.out.println("Informe que horas começou o jogo");
        int horaInicio = leitor.nextInt();
        System.out.println("Informe que horas terminou o jogo");
        int horaTermino = leitor.nextInt();

        int duracao = horaTermino-horaInicio;

        if (duracao <= 0 ){
            duracao = (horaTermino-horaInicio) + 24;
            System.out.println("------------------------------------");
            System.out.println("Duração da partida: " + duracao + "h");
            System.out.println("------------------------------------");
        } else {
            System.out.println("------------------------------------");
            System.out.println("Duração da partida: " + duracao + "h");
            System.out.println("------------------------------------");
        }


        leitor.close();


    }
}
