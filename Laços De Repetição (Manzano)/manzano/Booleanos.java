package manzano;

public class Booleanos {

	public static void main(String[] args) {
		
		int x = 1;
		int a = 3;
		int b = 5;
		int c = 8;
		int d = 7;
		
		boolean teste1 = !(x>3);
		boolean teste2 = (x<1 && !(b>d));
		boolean teste3 = !(d>0) && (c>5);
		boolean teste4 = !(x>3) && (c<7);
		boolean teste5 = (a>b) || (c>d);
		boolean teste6 = x>=2;
		boolean teste7 = (x<1) && (b>=d);
		boolean teste8 = (d<0) || (c>5);
		boolean teste9 = !(d>3) || !(b<7);
		boolean teste10 = (a>b) || !(c>b);
		
		System.out.println("A) !(x>3) = "+teste1);
		System.out.println("B) (x<1 && !(b>d)) = "+teste2);
		System.out.println("C) !(d>0) && (c>5) = "+teste3);
		System.out.println("D) !(x>3) && (c<7) = "+teste4);
		System.out.println("E) (a>b) || (c>d) = "+teste5);
		System.out.println("F) x>=2 = "+teste6);
		System.out.println("G) (x<1) && (b>=d) = "+teste7);
		System.out.println("H) (d<0) || (c>5) = "+teste8);
		System.out.println("I) !(d>3) || !(b<7) = "+teste9);
		System.out.println("J) (a>b) || !(c>b) = "+teste10);
		
	}

}
