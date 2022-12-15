package manzanoRepita;

import java.util.Scanner;

public class E08 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        char resposta = 's';
        byte altura;
        byte comprimento;
        int areaResidencia;
        int acumuladora = 0;
        do {

            System.out.println("Informe o nome do comodo: ");
            String comodo = leitor.next();
            System.out.println("Informe a altura em metros do " + comodo);
            altura = leitor.nextByte();
            System.out.println("Informe o comprimento em metros do " + comodo);
            comprimento = leitor.nextByte();
            areaResidencia = comprimento * altura;
            acumuladora += areaResidencia;

            System.out.println("Possui mais algum comodo?");
            resposta = leitor.next().charAt(0);

        } while (resposta == 's');
        System.out.println("A �rea total de sua resid�ncia �: " + acumuladora + "m�");
        leitor.close();
    }

}
