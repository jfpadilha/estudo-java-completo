package Classe;

/**
 * Concatenar Strings usando StringBuilder Concatenar usando String.format
 * 
 * @author joao
 *
 */

public class Data {

	// atributos
	int dia;
	int mes;
	int ano;

	String obterDataFormatada() {
		/*
		 * StringBuilder dt = new StringBuilder();
		 * dt.append(dia).append('/').append(mes).append('/').append(ano); return
		 * dt.toString();
		 */
		return String.format("%d/%d/%d/", dia, mes, ano);
	}

	String obterDataFormatada(String diaSemana) {
		/*
		 * StringBuilder dt = new StringBuilder();
		 * dt.append(dia).append('/').append(mes).append('/').append(ano).append(" - ").
		 * append(diaSemana); return dt.toString();
		 */
		return String.format("%d/%d/%d/ - %s", dia, mes, ano, diaSemana);
	}
}
