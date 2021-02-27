package controle;

import java.text.Normalizer;
import java.util.Scanner;

/**
 * O usuário vai informar o dia da semana
 * 
 * O programa deve retornar o numero associado aquele dia
 * 
 * Domingo 1, segunda 2, terça 3 etc *
 * 
 * @author joao
 *
 */

public class DesafioDiaSemana {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		int r = 0;

		System.out.println("Dia: ");
		String d = e.nextLine().toLowerCase();
		String s = d;
		d = Normalizer.normalize(d, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");

		if (d.contains("domingo")) {
			r = 1;
		} else if (d.contains("segunda")) {
			r = 2;
		} else if (d.contains("terca")) {
			r = 3;
		} else if (d.contains("quarta")) {
			r = 4;
		} else if (d.contains("quinta")) {
			r = 5;
		} else if (d.contains("sexta")) {
			r = 6;
		} else if (d.contains("sabado")) {
			r = 7;
		} else {
			System.out.println("Invalido 1");
		}

		System.out.println(r);

		System.out.println("--------------");

		if (d.equalsIgnoreCase("domingo")) {
			System.out.println("1");
		} else if (s.equalsIgnoreCase("segunda")) {
			System.out.println("2");
		} else if (d.equalsIgnoreCase("terca")) {
			System.out.println("3");
		} else if (d.equalsIgnoreCase("quarta")) {
			System.out.println("4");
		} else if (d.equalsIgnoreCase("quinta")) {
			System.out.println("5");
		} else if (d.equalsIgnoreCase("sexta")) {
			System.out.println("6");
		} else if (d.equalsIgnoreCase("sabado")) {
			System.out.println("7");
		} else {
			System.out.println("Invalido 2");
			;
		}

		System.out.println("--------------");

		if ("domingo".equalsIgnoreCase(d)) {
			System.out.println("1");
		} else if ("segunda".equalsIgnoreCase(d)) {
			System.out.println("2");
		} else if ("terca".equalsIgnoreCase(d)) {
			System.out.println("3");
		} else if ("quarta".equalsIgnoreCase(d)) {
			System.out.println("4");
		} else if ("quinta".equalsIgnoreCase(d)) {
			System.out.println("5");
		} else if ("sexta".equalsIgnoreCase(d)) {
			System.out.println("6");
		} else if ("sabado".equalsIgnoreCase(d)) {
			System.out.println("7");
		} else {
			System.out.println("Invalido 3");

		}

		e.close();

	}

}
