package manzanoPara;

public class L05G {

	public static void main(String[] args) {
		
		int potencia = 1;
		System.out.println("3 ^ 0 = 1");
		for (byte contadora = 0; contadora <= 15; contadora++) {
			potencia = potencia*3;
			System.out.println(3 + " ^ " + contadora + " = " + potencia);
		}

	}

}
