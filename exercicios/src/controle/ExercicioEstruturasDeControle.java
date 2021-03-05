package controle;

import java.util.Iterator;
import java.util.Scanner;

/**
 * Estruturas de Controle
 * 
 * 1. Criar um programa que receba um número e verifique se ele está entre 0 e
 * 10 e é par;
 * 
 * 2. Criar um programa informa se o ano atual é um ano bissexto;
 * 
 * 3. Criar um programa que receba duas notas parciais, calcular a média final.
 * Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado", se
 * a nota for menor que 7.0 e maior do que 4.0 imprime no console
 * "Recuperação", caso contrário imprime no console "Reprovado".
 * 
 * 4. Criar um programa que receba um número e diga se ele é um número primo.
 * 
 * 5. Refatorar o exercício 04, utilizando a estrutura switch.
 * 
 * 6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene um
 * numero aleatório em uma variável. O Jogador tem 10 tentativas para adivinhar
 * o número gerado. Ao final de cada tentativa, imprima a quantidade de
 * tentativas restantes, e imprima se o número inserido é maior ou menor do que
 * o número armazenado.
 * 
 * 7. Criar um programa que enquanto estiver recebendo números positivos,
 * imprime no console a soma dos números inseridos, caso receba um número
 * negativo, encerre o programa. Tente utilizar a estrutura do while.
 * 
 * 8. Criar um programa que receba uma palavra e imprime no console letra por
 * letra.
 * 
 * 9. Crie um programa que recebe 10 valores e ao final imprima o maior número.
 * 
 * 
 * 
 * @author joao
 *
 */

public class ExercicioEstruturasDeControle {

	public static void main(String[] args) {

		Scanner e = new Scanner(System.in);

		System.out.println("****** EXE 1 ******");

		System.out.println("um Numero");

		int n = e.nextInt();

		if (n >= 0 && n <= 10 && n % 2 == 0) {
			System.out.printf("'%d' está entre 0 e 10 e é par\n\n", n);
		} else {
			System.out.printf("'%d' não está entre 0 e 10 ou é ímpar\n\n", n);
		}

		System.out.println("****** EXE 2 ******");

		System.out.println("Diga um ano");
		int bi = e.nextInt();

		boolean div4 = bi % 4 == 0 ? true : false;
		boolean div100 = bi % 100 == 2 ? true : false;

//		if (bi % 4 == 0 && bi % 100 != 2) {
		if (div4 && !div100) {
			System.out.printf("%d é bissesto\n", bi);
		} else {
			System.out.printf("%d não é bissesto\n", bi);
		}

		System.out.println("******* EXE 3 *****");

		double n1 = 0.0;
		double n2 = 0.0;
		do {
			System.out.println("Nota 1: ");
			n1 = Double.parseDouble(e.next().replace(",", "."));

			System.out.println("Nota 2: ");
			n2 = Double.parseDouble(e.next().replace(",", "."));
		} while (n1 > 10.0 || n1 < 0.0 || n2 > 10.0 || n2 < 0.0);

		double m = (n1 + n2) / 2;

		if (m >= 7.0) {
			System.out.println("média: " + m);
			System.out.println("Aprovado");
		} else if (m >= 4.0) {
			System.out.println("média: " + m);
			System.out.println("Recuperação");
		} else {
			System.out.println("média: " + m);
			System.out.println("reprovado");
		}

		System.out.println("******* EXE 4 *****");

		int contadorDeDivisores = 0;

		System.out.println("\nDigite um numero para verificar se é primo:");
		int numero = e.nextInt();

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}

		if (contadorDeDivisores == 0) {
			System.out.println("\nO numero " + numero + " é primo.");
		} else {
			System.out.println("\nO numero " + numero + " não é primo.");
		}

		System.out.println("****** EXE 5 ******");

		int contadorDeDivisores2 = 0;

		System.out.println("\nDigite um numero para verificar se é primo:");
		int numerob = e.nextInt();

		for (int i = 2; i < numero; i++) {
			if (numerob % i == 0) {
				contadorDeDivisores2++;
			}
		}

		switch (contadorDeDivisores2) {

		case 0:
			System.out.println("O numero " + numero + " é um numero primo.");
			break;

		default:
			System.out.println("O numero " + numero + "  não é um numero primo.");

		}

		System.out.println("****** EXE 6 ******");

		int num = 20;
		int i = 9;
		int ad = 0;
		do {
			System.out.println("adivinhe um numero");
			ad = e.nextInt();

			if (ad == num) {
				System.out.println("Voce venceu!");
			} else {

				System.out.println("Restante: " + i);
				if (ad > num) {
					System.out.println("era maior!");
					System.out.println("faltam " + i);
				} else {
					System.out.println("era menor");
					System.out.println("faltam " + i);
				}
			}
			i--;

		} while (ad != num && i >= 0);

		System.out.println("Fim");

		System.out.println("****** EXE 7 ******");

		int np = 0;
		int auxsoma = 0;

		do {
			System.out.println("Numero positivo:");
			np = e.nextInt();

			if (np > 0) {
				auxsoma = np + auxsoma;
				System.out.println("soma: " + auxsoma);
			} else {
				break;
			}
		} while (np > 0);

		System.out.println("saiu");

		System.out.println("****** EXE 8 ******");

		System.out.println("uma palavra: ");
		String i8 = e.nextLine();

		for (int ji8 = 0; ji8 < i8.length(); ji8++) {
			System.out.println(i8.charAt(ji8));
		}

		System.out.println("****** EXE 9 ******");

		int mr = 0;
		int nval = 0;

		for (int mrj = 1; mrj <= 10; mrj++) {
			System.out.println(mrj + " - um numero: ");
			nval = e.nextInt();

			if (nval > mr) {
				mr = nval;
			}
		}
		System.out.println("maior é: " + mr);

	}
}
