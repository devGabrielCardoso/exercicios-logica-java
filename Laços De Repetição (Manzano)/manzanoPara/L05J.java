package manzanoPara;

public class L05J {

	public static void main(String[] args) {
	
	int celsius = 10;
	float fahrenheit;

	for (byte contadora = 1; contadora <= 10; contadora++) {
		fahrenheit = (celsius*9 + 160)/5;
		System.out.println("A temperatura " + celsius + "°C pode ser convertida em " + fahrenheit + "°F");
		celsius = celsius+10;
		
	}
	
	}

}
