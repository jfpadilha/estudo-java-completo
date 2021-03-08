package Classe;

/**
 * Loja vai ter 25% de desconto a todos os produtos Padrão 25%
 * 
 * Quando variar o desconto, vai variar para todos
 * 
 * @author joao
 *
 */

public class Produto {

	/**** Atributos ****/
	String nome;
	double preco;
	static double desconto;

	/**** Construtores ****/
	Produto() {
	}

	Produto(String nome) {
		this.nome = nome;
	}

	Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	/**** Métodos ****/

	double precoComDesconto() {
		return preco - (preco * desconto / 100); //
		// return preco * (1 - desconto);
	}

	static double precoComDesconto(double preco) {
		return preco - (preco * desconto / 100);
	}
}