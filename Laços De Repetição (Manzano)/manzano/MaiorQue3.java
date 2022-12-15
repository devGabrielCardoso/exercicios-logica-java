package manzano;

import java.util.Scanner;

public class MaiorQue3 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um valor: ");
		int valor = sc.nextInt();
		
		if (valor<=3) {
			System.out.println("O valor informado foi: "+valor);
		}
		sc.close();
	}
	
}
