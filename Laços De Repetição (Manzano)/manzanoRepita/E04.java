package manzanoRepita;

public class E04 {

    public static void main(String[] args) {

        byte contadora = 1;
        float acumuladora = 0;
        do {
            acumuladora = acumuladora + acumuladora + 1;
            System.out.println("O n�mero de gr�os no " + contadora + "� quadro �: " + acumuladora);
            contadora++;
        } while (contadora <= 64);

    }

}
