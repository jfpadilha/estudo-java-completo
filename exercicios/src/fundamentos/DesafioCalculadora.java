package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		
		System.out.println("Num 1: ");
		double n1 = e.nextDouble();
		
		System.out.println("Num 2: ");
		double n2 = e.nextDouble();
		
		System.out.println("Operador: ");
		char o = e.next().charAt(0);
		
		double r = o == '+' ? n1 + n2 :
				o == '-' ? n1 - n2 :
				o == '*' ? n1 * n2 :
				o == '/' ? n1 / n2 :
				o == '%' ? n1 % n2 : 0;
		
		double r2 = "+".equals(Character.toString(o)) ? n1 + n2 : 
					"-".equals(Character.toString(o)) ? n1 - n2 : 
					"*".equals(Character.toString(o)) ? n1 * n2 : 
					"/".equals(Character.toString(o)) ? n1 / n2 : 
					"%".equals(Character.toString(o)) ? n1 % n2 : 0;
		
		System.out.println("R': " + r);
		System.out.println("R2': " + r2);
		
		e.close();
	}

}
