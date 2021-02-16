package fundamentos;

/**
 * Aula 18 e 19- Variaveis e constantes
 * @author joao
 *
 */

public class Temperatura {
	
	public static void main(String[] args) {
//		(ºF -32) x (5/9) = ºC
		final double fator = 5.0 / 9.0;
		final double ajuste = 32;
		
		double f = 92;
		double c = (f - ajuste) * fator;
		
		System.out.println(c);
	}

}
