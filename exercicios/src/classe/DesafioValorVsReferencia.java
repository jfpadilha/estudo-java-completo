package classe;

/**
 * Desafio priemrio trauma
 * 
 * #104 & #105 - Desafio valor vs referencia;
 * 
 * Não pode mexer na linha : 11
 * 
 * Resolver o bug
 * 
 * @author joao
 *
 */

public class DesafioValorVsReferencia {

	int a = 3;
	static int b = 4;

	public static void main(String[] args) {
		DesafioValorVsReferencia b = new DesafioValorVsReferencia();
		System.out.println(b.obterA());
		System.out.println(b.a);
		System.out.println(b);

	}

	int obterA() {
		return a;
	}

}
