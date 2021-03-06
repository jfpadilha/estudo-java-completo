package Classe;

/**
 * nessa classe sera executado instanciado a classe "produto"
 * 
 * @author joao
 *
 */

public class ProdutoTeste {

	public static void main(String[] args) {

		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 2000.00;
		p1.desconto = 0.25;

		var p2 = new Produto();
		p2.nome = "Caneta preta";
		p2.preco = 12.56;
		p2.desconto = 0.29;

		System.out.println(p2.nome);
		System.out.println(p1.preco * (1 - p1.desconto));
	}
}
