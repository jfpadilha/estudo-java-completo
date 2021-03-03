package controle;

/**
 * Restrição: não pode usar valor numerico para controlar o laço
 * 
 * Mostrar o símbolo '#' por linha e ir dobrando a quantidade a cada linha
 * 
 * @author joao
 *
 */

public class DesafioFor {
	public static void main(String[] args) {

		for (String v = "#"; !v.equals("######"); v += "#") {
			System.out.println(v);
		}

	}

};