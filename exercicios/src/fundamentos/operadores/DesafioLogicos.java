package fundamentos.operadores;

import java.util.Scanner;

/**
 * Trabalho na terça (V ou F) Trabalho na quinta (V ou F)
 * 
 * Se os 2 derem certo, vai comprar uma TV 50" e sorvete Se apenas um deles der
 * certo comprar uma TV de 32" e sorvete Se nenhum der certo, nao tera TV nem
 * sorvete
 * 
 * @author joao
 *
 */

public class DesafioLogicos {
	public static void main(String[] args) {

		boolean bt = false;
		boolean qt = false;

		Scanner e = new Scanner(System.in);

		System.out.println("Terça deu certo? S/N: ");
		char ter = e.nextLine().toUpperCase().charAt(0);

		System.out.println("Quinta deu certo? S/N: ");
		char qui = e.nextLine().toUpperCase().charAt(0);

		if (ter == 'S') {
			bt = true;
		}

		if (qui == 'S') {
			qt = true;
		}

		System.out.print("TV 50\": ");
		System.out.println(bt && qt);

		System.out.print("TV 32\": ");
		System.out.println(bt ^ qt);

		System.out.print("SORVETE': ");
		System.out.println(bt || qt);

		System.out.print("Saudável?: ");
		System.out.println(!bt && !qt);

		e.close();
	}

}
