package classe;

/**
 * Variaveis locais DEVEM ser inicializadas
 * 
 * Variaveis nao inicializadas gera erros de compilacao
 * 
 * Erro de runtime, erro em tempo de execução, ex.: < String s2 = null; > a
 * variável foi inicializada, o código irá compilar, porém ocorrerá o erro
 * "NullPointerException" é a tentativa de acessar algum atributo ou
 * comportamento de uma variável nula não se pode nem acessar um método ou
 * atributo de algo que está nulo ou algo não aponta para um objeto real na
 * memória
 *
 * 
 * 
 * @author joao
 *
 */

public class valorNulo {

	public static void main(String[] args) {

		String s1 = "";
		System.out.println(s1.concat("!!!"));

		Data dt = Math.random() > 0.5 ? new Data() : null;

		if (dt != null) {
			dt.mes = 3;
			System.out.println(dt.obterDataFormatada());
		}

		String s2 = Math.random() > 0.5 ? s2 = "Ok" : null;
		if (s2 != null) {
			System.out.println(s2.concat(" -> não é nulo"));
		}

	}

}
