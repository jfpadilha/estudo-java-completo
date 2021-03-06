package Classe;

public class Produto {

	// atributos
	String nome;
	double preco;
	double desconto;

	// retorno eh double
	double precoComDesconto() {
		return preco - (preco * desconto / 100);
//		return preco * (1 - desconto);
	}

	// retorno double, mesmo nome, mas a assinatura eh diferente
	double precoComDesconto(double descontoDoGerente) {
		return preco - (preco * (desconto + descontoDoGerente) / 100);
//		return preco * (1 - desconto);
	}
}