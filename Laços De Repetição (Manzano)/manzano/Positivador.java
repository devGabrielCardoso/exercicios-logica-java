package manzano;

import java.util.Scanner;

public class Positivador {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um valor: ");
		int valor = sc.nextInt();

		if (valor < 0) {
			valor = valor * (-1);
		}
		System.out.println("O valor positivo correspondente é: " + valor);
		sc.close();

	}

}
