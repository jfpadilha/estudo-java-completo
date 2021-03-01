package controle;

import java.util.Scanner;

/**
 * Digitar nota valida (0 a 10)
 * 
 * Quando digitar, armazenar e ir acrescentando numa variavel "total"
 * 
 * Armazenar a quantidade de notas validas digitadas
 * 
 * No final vai mostrar a média
 * 
 * Para sair precisa digitar "-1"
 * 
 * @author joao
 *
 */

public class DesafioWhile {
	public static void main(String[] args) {

		Scanner e = new Scanner(System.in);
		double nota = 0.0;
		double total = 0.0;
		int cont = 0;
		double media = 0.0;

		while (nota != -1) {
			System.out.println("Nota: ");
			nota = Double.parseDouble(e.nextLine().replace(",", "."));

			if (nota >= 0 && nota <= 10) {
				total += nota;
				cont++;
			} else if (nota != -1) {
				System.out.println("nota invalida");
			}
		}

		media = cont > 0 ? total / cont : 0;
		System.out.printf("Total: %.1f\nMedia: %.1f\nQuant notas: %d", total, media, cont);

		e.close();
	}
}
