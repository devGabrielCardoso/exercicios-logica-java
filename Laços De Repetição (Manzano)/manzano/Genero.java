package manzano;

import java.util.Scanner;

public class Genero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = sc.next();
		System.out.println("Informe com qual gênero você se identifica [homem/mulher]");
		String genero = sc.next();
		if (genero == "homem") {
			System.out.println("Seja bem vindo, Sr. "+nome);
		} else if (genero == "mulher") {
			System.out.println("Seja bem vinda, Sra. "+nome);
		}
		sc.close();

	}

}
