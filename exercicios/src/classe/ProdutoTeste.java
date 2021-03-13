package classe;

/**
 * nessa classe sera executado instanciado a classe "produto"
 * 
 * @author joao
 *
 */

public class ProdutoTeste {

	public static void main(String[] args) {

		Produto.desconto = 25;

		// Construtor passando args
		Produto p1 = new Produto("Notebook", 2000.00);

		// Construtor 2
		var p2 = new Produto();
		p2.nome = "Caneta preta";
		p2.preco = 100.00;

		System.out.printf("p1: Prod %s - Preço %.2f - C/ Desc%.2f\n\n", p1.nome, p1.preco,
				Produto.precoComDesconto(600));

		System.out.printf("p2: Prod %s - Preço %.2f - C/ Desc %.2f\n", p2.nome, p2.preco, p2.precoComDesconto());
	}
}
