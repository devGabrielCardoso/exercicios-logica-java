package manzanoEnquanto;

import java.util.Scanner;

public class E09 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		byte contadora = 1;
		byte valor;
		int soma = 0;
		
		while (contadora<=10) {
			System.out.println("Informe o "+contadora+"� valor: ");
			valor = leitor.nextByte();
			soma += valor;
			contadora++;
		}
		System.out.println("A soma dos valores correspondentes �: "+soma);
		float media = soma/10;
		System.out.println("A m�dia correspondente �: "+media);
		leitor.close();
	}

}
