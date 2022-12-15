package manzanoEnquanto;

import java.util.Scanner;

public class E10 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		char resposta = 'S';
		int area;
		int areaTotal = 0;
		while (resposta=='S') {
			System.out.println("Informe o nome do cômodo: ");
			String comodo = leitor.next();
			System.out.println("Informe a base do"+comodo+" : ");
			byte base = leitor.nextByte();
			System.out.println("Informe a altura do"+comodo+" : ");
			byte altura = leitor.nextByte();
			area = base*altura;
			areaTotal += area;
			System.out.println("Possui mais algum cômodo?");
			resposta = leitor.next().charAt(0);
		}
		System.out.println("A área total de sua residência é: "+areaTotal+"m²");
		leitor.close();

	}

}
