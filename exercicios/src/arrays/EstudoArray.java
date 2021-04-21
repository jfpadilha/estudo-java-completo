package arrays;

import java.util.Arrays;

public class EstudoArray {

	public static void main(String[] args) {

//		Criando um array (vetor) pós-definido
		double notasAlunoA[] = new double[3];
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 9;
		notasAlunoA[2] = 6.7;

//		Imprimindo um array (vetor)
		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println("Prim nota " + notasAlunoA[0]);
		System.out.println("Últ nota " + notasAlunoA[notasAlunoA.length -1]);

//		Percorrendo um array (vetor)
		double totalAlunoA = 0;
		for (int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
		}
		System.out.printf("Total A: %.1f \nMédia A: %.1f\n\n", totalAlunoA, totalAlunoA / notasAlunoA.length);


//		Criando um array (vetor) pré-definido
		final double notaArmazenada = 5.9;
		
		double notasAlunoB[] = { 6.9, 8.9, notaArmazenada, 10 };
		double totalAlunoB = 0;
		
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}

		System.out.println(Arrays.toString(notasAlunoB));
		System.out.printf("Total B: %.1f \nMédia B: %.1f", totalAlunoB, totalAlunoB / notasAlunoB.length);

	}
}
