package manzano;

import java.util.Scanner;

public class FaixaPermitida {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = sc.nextInt();
		
		if ((numero>=1) && (numero<=9)) {
			System.out.println("O número "+numero+" está dentro da faixa permitida");
		} else {
			System.out.println("O número "+numero+" não está dentro da faixa permitida");
		}
		sc.close();
		
	}
	
}
