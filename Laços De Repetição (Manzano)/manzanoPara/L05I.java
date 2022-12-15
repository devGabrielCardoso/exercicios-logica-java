package manzanoPara;

public class L05I {

	public static void main(String[] args) {
		
		int sucessor = 1;
		int antecessor = 0;
		int soma;
		
		System.out.print("0, 1, ");
		
		for (byte contadora = 3; contadora <= 15; contadora++) {
			soma = sucessor + antecessor;
			antecessor = sucessor;
			sucessor = soma;
			System.out.print(soma + ", ");
		}

	}

}
