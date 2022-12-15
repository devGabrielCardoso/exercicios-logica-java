package manzanoRepita;

import java.util.Scanner;

public class E06 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        byte valor = 0;
        int acumuladora = 0;
        byte lidos = 0;
        do {

            System.out.println("Informe um valor: ");
            valor = leitor.nextByte();
            if (valor > 0) {
                acumuladora += valor;
            }
            lidos++;
        } while (valor > 0);
        float media = acumuladora / lidos;
        System.out.println("O somat�rio dos valores informados �: " + acumuladora);
        System.out.println("A m�dia dos valores solicitados �: " + media);
        System.out.println("A quantidade de valores informados �: " + lidos);
        leitor.close();
    }

}
