package manzanoEnquanto;

import java.util.Scanner;

public class E10 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		char resposta = 'S';
		int area;
		int areaTotal = 0;
		while (resposta=='S') {
			System.out.println("Informe o nome do c�modo: ");
			String comodo = leitor.next();
			System.out.println("Informe a base do"+comodo+" : ");
			byte base = leitor.nextByte();
			System.out.println("Informe a altura do"+comodo+" : ");
			byte altura = leitor.nextByte();
			area = base*altura;
			areaTotal += area;
			System.out.println("Possui mais algum c�modo?");
			resposta = leitor.next().charAt(0);
		}
		System.out.println("A �rea total de sua resid�ncia �: "+areaTotal+"m�");
		leitor.close();

	}

}
