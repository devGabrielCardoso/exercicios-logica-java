package manzano;

import java.util.Scanner;

public class AprovacaoExigente {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Informe o nome do aluno: ");
		String aluno = sc.next();
		System.out.println("Informe a primeira nota do aluno "+aluno+": ");
		float nota1 = sc.nextFloat();
		System.out.println("Informe a segunda nota do aluno "+aluno+": ");
		float nota2 = sc.nextFloat();
		System.out.println("Informe a terceira nota do aluno "+aluno+": ");
		float nota3 = sc.nextFloat();
		System.out.println("Informe a quarta nota do aluno "+aluno+": ");
		float nota4 = sc.nextFloat();
		float media = (nota1+nota2+nota3+nota4)/4;
		System.out.println("A media do aluno "+aluno+" é: "+media);
		if (media>=7) {
			System.out.println("O aluno foi aprovado!");
		} else if (media<7) {
			System.out.println("Informe a nota do exame");
			float notaExame = sc.nextFloat();
			float novaMedia = (nota1+nota2+nota3+nota4+notaExame)/5;
			if (novaMedia>=5) {
				System.out.println("A nova média do aluno "+aluno+" é: "+novaMedia);
				System.out.println("O aluno foi aprovado!");
			} else if (novaMedia<5) {
				System.out.println("A nova média do aluno "+aluno+" é: "+novaMedia);
				System.out.println("O aluno foi reprovado!");
			}
		}
		
		
		sc.close();
	}

}
