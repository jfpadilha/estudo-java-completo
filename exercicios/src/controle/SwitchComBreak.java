package controle;

import java.util.Scanner;

public class SwitchComBreak {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);

		String c = "";

		do {
			System.out.println("nota: ");
			int nota = e.nextInt();

			switch (nota) {
			case 10:
			case 9:
				c = "A";
				break;
			case 8:
			case 7:
				c = "B";
				break;
			case 6:
			case 5:
				c = "C";
				break;
			case 4:
			case 3:
				c = "D";
				break;
			case 2:
			case 1:
				c = "E";
				break;
			default:
				c = "Não encontrado";
				System.out.println(c);
				break;
			}

		} while (c.equals("Não encontrado"));

		System.out.printf("Conceito: %s\n", c);
		System.out.println("Fim!");

	}

}
