package arrays;

import javax.swing.JOptionPane;

public class Matriz {

	public static void main(String[] args) {
		String qtdAlunosS = JOptionPane.showInputDialog("Quantos alunos? ");
		String qtdNotasS = JOptionPane.showInputDialog("Quantas notas? ");

		int qtdAlunos = Integer.parseInt(qtdAlunosS);
		int qtdNotas = Integer.parseInt(qtdNotasS);

		double matrizNotasTurma[][] = new double[qtdAlunos][qtdNotas];

		double notaTurma = 0;
		double notaTotalindivirual = 0;
		double media = 0;

		for (int i = 0; i < qtdAlunos; i++) { // Qtd de linhas
			for (int j = 0; j < qtdNotas; j++) { // Qtd de colunas
				String sn = JOptionPane.showInputDialog("Nota: " + (j + 1));

				matrizNotasTurma[i][j] = Double.parseDouble(sn.replace(",", "."));

				System.out.print((matrizNotasTurma[i][j]) + " | ");
				notaTurma += Double.parseDouble(sn.replace(",", "."));
				notaTotalindivirual += Double.parseDouble(sn.replace(",", "."));
			}
			media = notaTotalindivirual / qtdNotas;
			System.out.println("  -> " + notaTotalindivirual + " | Média: " + media);
			notaTotalindivirual = 0;
			media = 0;
		}

		System.out.println("\n");

		media = notaTurma / (qtdAlunos * qtdNotas);
		System.out.println("Média geral: " + media);
		System.out.println("Nota turma: " + notaTurma);
	}

}
