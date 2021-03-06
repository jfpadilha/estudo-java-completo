package Classe;

/**
 * nessa classe sera executado instanciado a classe "produto"
 * 
 * @author joao
 *
 */

public class ProdutoTeste {

	public static void main(String[] args) {

		Produto p1 = new Produto("Notebook", 2000.00, 25.0);

		var p2 = new Produto();
		p2.nome = "Caneta preta";
		p2.preco = 12.56;
		p2.desconto = 25;

		System.out.printf("p1: %.2f\n", p1.precoComDesconto(25));
		System.out.printf("p2: %.2f\n", p2.precoComDesconto());
	}
}
