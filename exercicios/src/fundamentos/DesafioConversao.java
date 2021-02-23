package fundamentos;

import java.util.Scanner;

/**
 * Algoritmo que recebe 3 strings utilizando Scanner Deve receber 3 valores
 * referente a 3 meses de salario de um funcionario Deve calcular a media
 * salarial dos ultimos 3 meses
 * 
 * @author joao
 * 
 * Scanner com Next pega uma unica palavra ou unico trecho
 * Scanner com NextLine pega a linha inteira
 *
 */

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);

		System.out.println("Salario mês 1: ");
		double m1 = Double.parseDouble(e.nextLine().replace(",", "."));

		System.out.println("Salario mês 2: ");
		double m2 = Double.parseDouble(e.nextLine().replace(",", "."));

		System.out.println("Salario mês 3: ");
		double m3 = Double.parseDouble(e.nextLine().replace(",", "."));

		double med = (m1 + m2 + m3) / 3;

		System.out.printf("Mês 1: %.2f \nmês 2: %.2f \nmês 3 %.2f \n\nMedia salarial: %.2f", m1, m2, m3, med);
		
		e.close();
	}
}
