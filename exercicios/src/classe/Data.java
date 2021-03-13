package classe;

/**
 * Concatenar Strings usando StringBuilder e Concatenar usando String.format
 * Segundo ajuste: #106 - This e This()
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
//		this.dia = 1;
//		this.mes = 1;
//		this.ano = 1970;
		this(1, 1, 1970);
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
		return String.format("%d/%d/%d", this.dia, this.mes, this.ano);
	}

	String obterDataFormatada(String diaSemana) {
		/*
		 * StringBuilder dt = new StringBuilder();
		 * dt.append(dia).append('/').append(mes).append('/').append(ano).append(" - ").
		 * append(diaSemana); return dt.toString();
		 */
		return String.format("%d/%d/%d - %s\n", this.dia, this.mes, this.ano, diaSemana.toUpperCase());
	}

	void imprimirDataFormatada() {
		System.out.println(this.obterDataFormatada());
	}

}
