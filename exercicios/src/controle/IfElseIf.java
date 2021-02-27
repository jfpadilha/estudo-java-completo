package controle;

import java.util.Scanner;

public class IfElseIf {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);

		System.out.println("Nota: ");
		double n = Double.parseDouble(e.nextLine().replace(",", "."));

		if (n > 10 || n < 0) {
			System.out.println("Nota invalida");
		} else if (n >= 8.1) {
			System.out.println("Conceiro A");
		} else if (n >= 6.1) {
			System.out.println("Conceito C");
		} else if (n >= 4.1) {
			System.out.println("Conceito D");
		} else {
			System.out.println("Conceito E");
		}

		e.close();

	}

}
