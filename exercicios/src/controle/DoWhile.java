package controle;

import java.text.Normalizer;
import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		Scanner e = new Scanner(System.in);
		String s = "";

		do {
			System.out.println("sair?");

			s = e.nextLine().toLowerCase();
			s = Normalizer.normalize(s, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");

		} while (!s.contains("sair"));

		System.out.println("saiu!");

		e.close();
	}
}