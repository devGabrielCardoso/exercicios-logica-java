package manzano;

import java.util.Scanner;

public class MaiorEMenor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int contadora = 1;
		int maior = 0;
		int menor = 999999999;
		
		while (contadora<=5) {
			System.out.println("Informe um valor: ");
			int valor = sc.nextInt();
			if (valor>maior) {
				maior = valor;
			}
			if (menor>valor) {
				menor = valor;
			}
			contadora++;
		}
		System.out.println("Dos informados, o maior valor é: "+maior);
		System.out.println("Dos informados, o menor valor é: "+menor);
		sc.close();
	}

}
