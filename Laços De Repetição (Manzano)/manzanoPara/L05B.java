package manzanoPara;

import java.util.Scanner;

public class L05B {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o número que deseja ver a tabuada: ");
		byte numero = leitor.nextByte();
		
		int tabuada;
		for (byte contadora = 0; contadora <= 10; contadora++) {
			tabuada= numero*contadora;
			System.out.println(numero+" x "+contadora+" = "+tabuada);
		}
		leitor.close();
	}

}
