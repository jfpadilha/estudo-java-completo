package controle;

import java.text.Normalizer;
import java.util.Scanner;

/**
 * Ignorar o texto de entrada
 * 
 * Valiando registrando texto sem acentos
 * 
 * Removendo acentos e maiusculas
 * 
 * @author joao
 *
 */

public class WhileIndeterminado {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);

		String s = "";

		while (!s.contains("sair")) {
			System.out.println("sair?");
			s = e.nextLine().toLowerCase();
			s = Normalizer.normalize(s, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
		}

		System.out.println("Saiu!");
		e.close();

	}
}
