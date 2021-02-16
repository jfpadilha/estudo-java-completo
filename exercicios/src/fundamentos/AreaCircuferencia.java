package fundamentos;
/**
 * Aula 17 - variaveis e constantes
 * @author joao
 *
 */

public class AreaCircuferencia {
	public static void main(String[] args) {
		double raio = 3.4;
		final double pi = 3.14159; //o "final" sera uma constante (nao pode alterar)
		double area = pi * raio * raio;
		
		System.out.println(area);
	}

}
