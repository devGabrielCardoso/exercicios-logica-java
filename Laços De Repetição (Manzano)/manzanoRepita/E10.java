package manzanoRepita;

import java.util.Scanner;

public class E10 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o valor divisor: ");
        float divisor = leitor.nextByte();
        System.out.println("Informe o valor dividendo: ");
        float dividendo = leitor.nextByte();

        do {

            divisor = divisor / dividendo;
            System.out.println(divisor);
        } while (divisor >= dividendo);
        leitor.close();
    }

}
