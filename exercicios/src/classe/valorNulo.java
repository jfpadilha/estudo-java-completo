package classe;

/**
 * Variaveis locais DEVEM ser inicializadas
 * 
 * Variaveis nao inicializadas gera erros de compilacao
 * 
 * Variavel inicializada como "null" geram erros de runtime (em tempo de
 * execucao) "null pointer exception" que eh uma variavel nula, tentar acessar
 * algo dela, soh vai acontecer no momento da execucao, o eclipse nao vai battar
 * o e
 *
 * 
 * 
 * @author joao
 *
 */

public class valorNulo {

	public static void main(String[] args) {
		String s1 = "";
		System.out.println(s1.concat("???"));

		String s2 = null; // gera erro "null pointer exception" erro ao apontar o local na memoria
		System.out.println(s2.concat("???"));

	}

}
