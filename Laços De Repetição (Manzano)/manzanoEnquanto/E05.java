package manzanoEnquanto;

public class E05 {

	public static void main(String[] args) {
		
		byte contadora = 1;
		int calculo = 1;
		System.out.println("3 ^ 0 = 1");
		while (contadora<=15) {
			calculo = calculo * 3;
			System.out.println(3+" ^ "+contadora+" = "+calculo);
			contadora++;
		}

	}

}
