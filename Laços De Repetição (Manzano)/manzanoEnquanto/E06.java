package manzanoEnquanto;

import java.util.Scanner;

public class E06 {

	public static void main(String[]args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o valor que deseje ser a base: ");
		byte base = leitor.nextByte();
		System.out.println("Informe o valor que deseje ser o expoente: ");
		byte expoente = leitor.nextByte();
		
		int potencia = 1;
		byte contadora = 1;
		while (contadora<=expoente) {
			potencia = potencia*base;
			contadora++;
		}
		System.out.println(base+" ^ "+expoente+" = "+potencia);
		leitor.close();
		
		
	}
	
}
