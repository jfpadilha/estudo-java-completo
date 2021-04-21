package arrays;

import java.util.Arrays;

import javax.swing.JOptionPane;

/**
 * 
 * @author joao
 * 
 *         Exercício: Calcular a média das notas de um aluno O usuário irá
 *         passar as notas e a quantidade de notas Utilizar 2 laços "for"
 *         Primeiro laço para inserir as notas no array Segundo laço, "Foreach"
 *         percorrer o array, somar, calcular média e mostrar a média
 *
 */

public class ExercicioArray {

	public static void main(String[] args) {

		String qtdNotasS = JOptionPane.showInputDialog("Quantidade de notas");
		int qtdNotasInt = Integer.parseInt(qtdNotasS);

		double vetorNotas[] = new double[qtdNotasInt];

		for (int i = 0; i < qtdNotasInt; i++) {
			String sn = JOptionPane.showInputDialog("digite a nota " + (i + 1));
			vetorNotas[i] = Double.parseDouble(sn.replace(",", "."));
		}

		double total = 0;
		double media = 0;

		for (double d : vetorNotas) {
			total += d;
		}
		media = total / qtdNotasInt;

		System.out.println("Vetor notas: " + Arrays.toString(vetorNotas));
		System.out.println("Média: " + media);
		System.out.println("Total notas: " + total);

	}

}
