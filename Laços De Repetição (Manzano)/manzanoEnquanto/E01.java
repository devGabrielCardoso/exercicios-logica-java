package manzanoEnquanto;

import java.util.Scanner;

public class E01 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe o numero que deseja ver a tabuada: ");
		byte numero = leitor.nextByte();
		
		int tabuada;
		byte contadora = 1;
		while (contadora<=10) {
			tabuada = numero*contadora;
			System.out.println(numero+" x "+contadora+" = "+tabuada);
			contadora++;
		}
		leitor.close();

	}

}
