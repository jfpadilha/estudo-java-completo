package Classe;

/**
 * Classe main usada para instanciamento da classe Data
 * 
 * @author joao
 *
 */

public class DataMain {

	public static void main(String[] args) {
		Data dt = new Data();
		dt.dia = 22;
		dt.mes = 07;
		dt.ano = 1983;

		System.out.printf("data: %d/%d/%d", dt.dia, dt.mes, dt.ano);

	}
}
