package Classe;

/**
 * Concatenar Strings usando StringBuilder e Concatenar usando String.format
 * 
 * @author joao
 *
 */

public class Data {

	// atributos
	int dia;
	int mes;
	int ano;
	String diaSemana;

	// Construtores
	Data() {
		this.dia = 1;
		this.mes = 1;
		this.ano = 1970;
	}

	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	Data(int dia, int mes, int ano, String diaSemana) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.diaSemana = diaSemana;
	}

	String obterDataFormatada() {
		/*
		 * StringBuilder dt = new StringBuilder();
		 * dt.append(dia).append('/').append(mes).append('/').append(ano); return
		 * dt.toString();
		 */
		return String.format("%d/%d/%d", dia, mes, ano);
	}

	String obterDataFormatada(String diaSemana) {
		/*
		 * StringBuilder dt = new StringBuilder();
		 * dt.append(dia).append('/').append(mes).append('/').append(ano).append(" - ").
		 * append(diaSemana); return dt.toString();
		 */
		return String.format("%d/%d/%d - %s\n", dia, mes, ano, diaSemana);
	}
}
