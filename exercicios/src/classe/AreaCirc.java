package classe;

/**
 * Calcula e retorna o valor de área de um circulo
 * 
 * @author joao
 *
 */

public class AreaCirc {

	double raio;
	// com o "final" essa variavel será constante, não alterável com valor fixo
	final static double PI = 3.1415;

	// Construtores
	public AreaCirc(double raio) {
		this.raio = raio;
	}

	// Metodos
	double area() {
		return PI * Math.pow(raio, 2); // pi * raio² (raio ao quadrado)
	}

	// Metodo estatic
	static double area(double raio) {
		return PI * Math.pow(raio, 2); // pi * raio² (raio ao quadrado)
	}

	/**
	 * Obs:
	 * 
	 * Math.power é um método STATIC, por isso não foi necessário chamar o
	 * construtor de "Math" com "new"
	 */

}