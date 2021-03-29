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
	static String diaSemana; // o valor dessa variavel tera uma instancia unica

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
//		this.diaSemana = diaSemana; // nao precisa fazer esse 'set'

	}

	/**
	 * ************** Metodos
	 * 
	 */

	String obterDataFormatada() {
		/*
		 * StringBuilder dt = new StringBuilder();
		 * dt.append(dia).append('/').append(mes).append('/').append(ano); return
		 * dt.toString();
		 */

		final String formato = "%d/%d/%d"; // será uma constante local

		return String.format(formato, this.dia, this.mes, this.ano);
	}

	String obterDataFormatada(String diaSemana) {

		/*
		 * StringBuilder dt = new StringBuilder();
		 * dt.append(dia).append('/').append(mes).append('/').append(ano).append(" - ").
		 * append(diaSemana); return dt.toString();
		 */
//		String d = "%d/%d/%d - %s\n";	// D eh uma variavel local, soh funciona dentro do metodo
		final String d = "%d/%d/%d - %s\n"; // d eh uma variavel constante, nao pode ser modificada
		return String.format(d, this.dia, this.mes, this.ano, diaSemana.toUpperCase());
	}

	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada(diaSemana));
	}

}
