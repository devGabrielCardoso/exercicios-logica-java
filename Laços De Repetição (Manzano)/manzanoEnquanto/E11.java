package manzanoEnquanto;

import java.util.Scanner;

public class E11 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		byte valor = 0;
		byte maior = 0;
		byte menor = 127;
		while (valor >= 0) {
			System.out.println("Informe um valor: ");
			valor = leitor.nextByte();
			if (maior<valor) {
				maior = valor;
			}
			if (valor<menor && valor>= 0) {
				menor = valor;
			}
			
		}
		System.out.println("Dos informados, o maior valor foi: "+maior);
		System.out.println("Dos informados, o menor valor foi: "+menor);
		leitor.close();

	}

}
