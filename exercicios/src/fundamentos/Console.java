package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia\n");
		
		System.out.println("Bom");
		System.out.println(" dia");
		
		System.out.printf("Mega Sena: %d, %d, %d, %d, %d, %d \n\n",
				 1,2,3,4,5,6);
		
		System.out.printf("Salário: %.1f \n\n", 1234.5678);
		System.out.printf("Nome: %s%n", "Juca");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe seu nome: ");
		String nome = entrada.nextLine().toUpperCase();
		
		System.out.println("Informe seu nome: ");
		String sobreNome = entrada.nextLine().toUpperCase();
		
		System.out.println("Idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("\n\nO nome completo é: %s %s e possui %d anos",
				nome, sobreNome, idade);
	}
}
