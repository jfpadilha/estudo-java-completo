package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {

		System.out.println("2" == "2");

		String s = new String("2");
		System.out.println("2" == s);

//		"equals" eh que compara o conteudo
		System.out.println("2".equals(s));

		Scanner e = new Scanner(System.in);
		System.out.println("digite algo:\n\n");
		String s2 = e.nextLine();

		System.out.println("2" == s2.trim());
		System.out.println("2".equals(s2.trim())); // "trim" remove os espacos da String

		e.close();
	}

}
