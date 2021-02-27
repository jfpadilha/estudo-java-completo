package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		
		System.out.println("Informe a média:");
		double media = Double.parseDouble(e.nextLine().replace(",", "."));
		
		if (media >= 7.0 && media <= 10) {
			System.out.println("Aprovado");			
		}
		
		boolean resReprovado = media < 4.5;
		
		if (resReprovado) {
			System.out.println("Reprovado");			
		}
		
		e.close();
	}

}
