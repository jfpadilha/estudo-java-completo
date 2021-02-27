package fundamentos;

import java.util.Scanner;

/**
 * Criar um programa que leia a temperatura em Celsius e converta para
 * Fahrenheit.
 * 
 * Criar um programa que leia a temperatura em Fahrenheit e converta para
 * Celsius.
 * 
 * Criar um programa que leia o peso e a altura do usuário e imprima no console
 * o IMC.
 * 
 * Criar um programa que leia um valor e apresente os resultados ao quadrado e
 * ao cubo do valor.
 * 
 * Criar um programa que leia o valor da base e da altura de um triângulo e
 * calcule a área.
 * 
 * Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0)
 * utilizando a fórmula de Bhaskara. Use como exemplo a = 1, b = 12 e c = -13.
 * Encontre o delta
 * 
 * @author joao
 *
 */

public class ExerciciosConceitosBasicos {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);

		System.out.println("Conversão ºC -> ºF");
		System.out.println("Temp ºC: ");
		double n1 = Double.parseDouble(e.nextLine().replace(",", "."));
		double n2 = (n1 * 1.8000) + 32;
		System.out.println("Fahrenheit: " + n2);

		System.out.println("-------------");

		System.out.println("Temp ºF: ");
		n2 = Double.parseDouble(e.nextLine().replace(",", "."));
		n1 = (n2 - 32) / 1.8000;
		System.out.println("Celcius: " + n1);

		System.out.println("-------------");

		System.out.println("Informe o peso:");
		n1 = Double.parseDouble(e.nextLine().replace(",", "."));
		System.out.println("Informe altura:");
		n2 = Double.parseDouble(e.nextLine().replace(",", "."));
		double res = n1 / Math.pow(n2, 2);
		System.out.printf("IMC: %.2f \n", res);

		System.out.println("-------------");
		System.out.println("Informe um valor: ");
		n1 = Double.parseDouble(e.nextLine().replace(",", "."));
		n2 = Math.pow(n1, 2);
		double n3 = Math.pow(n1, 3);
		System.out.printf("V: %f\nQuad: %.2f\nCubo: %.2f\n", n1, n2, n3);

		System.out.println("-------------");
		System.out.println("Base de triangulo:");
		n1 = Double.parseDouble(e.nextLine().replace(",", "."));
		System.out.println("Altura de triangulo:");
		n2 = Double.parseDouble(e.nextLine().replace(",", "."));
		n3 = (n1 * n2) / 2;
		System.out.printf("Área de triangulo: %.3f\n", n3);

		System.out.println("-------------");
		System.out.println("valor para ax²:");
		n1 = Double.parseDouble(e.nextLine().replace(",", "."));
		System.out.println("Valor para bx:");
		n2 = Double.parseDouble(e.nextLine().replace(",", "."));
		System.out.println("Valor para c:");
		n3 = Double.parseDouble(e.nextLine().replace(",", "."));
		res = Math.pow(n2, 2) - 4 * n1 * n3;

		System.out.printf("Área de triangulo: %.3f\n", n3);

		e.close();

		/*
		 * public static void main(String[] args) {
		 * 
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.println("Equação: ax² + bx + c = 0");
		 * 
		 * System.out.println("\nDigite o valor de A: "); int a = scanner.nextInt();
		 * 
		 * System.out.println("\nDigite o valor de B: "); int b = scanner.nextInt();
		 * 
		 * System.out.println("\nDigite o valor de C: "); int c = scanner.nextInt();
		 * 
		 * int delta = (b * b) - (4 * a * c);
		 * 
		 * System.out.printf("\nSua equação é: %dx² + %dx + %d = 0", a, b, c);
		 * 
		 * System.out.println("\nO delta é: " + delta);
		 * 
		 * double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		 * 
		 * System.out.printf("O x1 da equação é: %.2f", x1);
		 * 
		 * double x2 = (-b - Math.sqrt(delta)) / (2 * a);
		 * 
		 * System.out.printf("\nO x2 da equação é: %.2f" ,x2);
		 * 
		 * scanner.close();
		 * 
		 */

	}

}
