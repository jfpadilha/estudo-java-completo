package classe;

/**
 * Classe main usada para instanciamento da classe Data
 * 
 * @author joao
 *
 */

public class DataMain {

	public static void main(String[] args) {
		Data dt = new Data(22, 07, 1983);
		
		Data dt2 = new Data();

		System.out.println(dt.obterDataFormatada("terça"));
		System.out.println(dt2.obterDataFormatada());
	}
}