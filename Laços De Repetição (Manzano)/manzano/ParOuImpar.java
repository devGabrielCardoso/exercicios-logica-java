package manzano;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int valor = sc.nextInt();
		
		if (valor%2==0) {
			System.out.println("O valor digitado é par");
		} else {
			System.out.println("O valor digitado é ímpar");
		}
		sc.close();
	}

}
