package manzano;

import java.util.Scanner;

public class Divisiveis2E3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int contadora = 1;
		
		
		while (contadora<=4) {
			System.out.println("Informe o "+contadora+"º valor: ");
			int valor = sc.nextInt();
			if ((valor%3==0) && (valor%2==0)) {
				System.out.println("O valor "+valor+" é divisível por 3 e 2");
			}
			contadora++;
		}
		sc.close();

	}

}
