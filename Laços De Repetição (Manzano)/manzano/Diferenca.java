package manzano;

import java.util.Scanner;

public class Diferenca {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um valor: ");
		int valor = sc.nextInt();
		System.out.println("Informe outro valor: ");
		int valor2 = sc.nextInt();
		int resultado;
		if (valor > valor2) {
			resultado = valor - valor2;
		} else {
			resultado = valor2 - valor;
		}
		System.out.println("A diferença dos valores correspondetes é: " + resultado);
		sc.close();
	}
}
