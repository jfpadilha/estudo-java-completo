package classe;

/**
 * Classe main usada para instanciamento da classe Data
 * 
 * @author joao
 *
 */

public class DataMain {

	public static void main(String[] args) {
		
		Data.diaSemana = "segunda";
		
		Data dt = new Data(22, 07, 1983, "sábado");
		System.out.println(dt.obterDataFormatada("terça"));
		
		Data dt2 = new Data(1, 01, 1994, "quinta");
		dt2.imprimirDataFormatada();
	}
}