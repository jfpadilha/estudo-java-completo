package Classe;

public class AreaCirc {

	double raio;
	final static double PI = 3.1415; // com o "final" essa variavel será constante, não alterável
	// static double pi = 3.14;

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