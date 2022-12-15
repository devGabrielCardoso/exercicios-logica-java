package manzanoPara;

public class L05D {

	public static void main(String[] args) {
		
		int acumuladora = 0;
		for (short contadora = 1; contadora <= 500; contadora++) {
			if (contadora%2==0) {
				acumuladora += contadora;
			}
		}
		System.out.println("A soma final dos valores pares entre 1 a 500 �: " + acumuladora);
	}

}
