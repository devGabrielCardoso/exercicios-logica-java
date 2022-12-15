package manzanoPara;

public class L05K {

	public static void main(String[] args) {
		
		byte antecessor = 9;
		int fatorial = 10;
		
		for (byte contadora = 10; contadora >= 1; contadora--) {
			if (antecessor%2==1) {
				System.out.println(fatorial + " x " + antecessor + " = " + (fatorial * antecessor));
				fatorial = fatorial * antecessor;
			}
			antecessor--;
			
		}

	}

}
