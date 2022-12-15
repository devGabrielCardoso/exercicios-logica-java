package manzano;

import java.util.Scanner;

public class OrdemCrescente {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor: ");
		int a = sc.nextInt();
		System.out.println("Informe o segundo valor: ");
		int b = sc.nextInt();
		System.out.println("Informe o terceiro valor: ");
		int c = sc.nextInt();
		if ((a>b) && (b>c)) {
			System.out.println("Os valores em ordem crescente são: "+c+", "+b+", "+a);
		} else if ((a>c) && (c>b)) {
			System.out.println("Os valores em ordem crescente são: "+b+", "+c+", "+a);
		} else if ((b>a) && (a>c)){
			System.out.println("Os valores em ordem crescente são: "+c+", "+a+", "+b);
		} else if ((b>c) && (c>a)) {
			System.out.println("Os valores em ordem crescente são: "+a+", "+c+", "+b);
		} else if ((c>a) && (a>b)) {
			System.out.println("Os valores em ordem crescente são: "+b+", "+a+", "+c);
		} else if ((c>b) && (b>a)) {
			System.out.println("Os valores em ordem crescente são: "+a+", "+b+", "+c);
		}
		sc.close();
		// 123, 132, 213, 231, 312, 321
	}
	
}
