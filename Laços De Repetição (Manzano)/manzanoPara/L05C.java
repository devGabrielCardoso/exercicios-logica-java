package manzanoPara;

public class L05C {

	public static void main(String[] args) {
		
		int acumuladora = 0;
		for (byte contadora = 1; contadora <= 100; contadora++) {
			acumuladora += contadora;
		}
		System.out.println("A soma total de 1 ao 100 é: " + acumuladora);
		
	}

}
