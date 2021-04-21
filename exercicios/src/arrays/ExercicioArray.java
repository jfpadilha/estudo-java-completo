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
			int n = i + 1;
			String sn = JOptionPane.showInputDialog("digite a nota " + n);
			vetorNotas[i] = Double.parseDouble(sn.replace(",", "."));
		}

		System.out.println(Arrays.toString(vetorNotas));

	}

}
