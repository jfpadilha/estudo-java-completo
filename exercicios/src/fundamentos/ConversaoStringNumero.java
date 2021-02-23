package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog(
				"Digite um numero");
		
		String valor2 = JOptionPane.showInputDialog(
				"Digite o valor 2");
	
		double num1 = Double.parseDouble(valor1);
		double num2 = Double.parseDouble(valor2);
		double soma = num1 + num2;
		
		System.out.printf("Vlores double: %f + %f = %f \n\n", num1, num2, soma);
		
		int n1 = (int) num1;
		int n2 = (int) num2;
//		int n1 = Integer.parseInt(valor2);
//		int n2 = Integer.parseInt(valor2);
		
		int sum = n1 + n2;
		
		System.out.printf("Valores int: %d | %d total: %d \n\n", n1, n2, sum);
	}

}
