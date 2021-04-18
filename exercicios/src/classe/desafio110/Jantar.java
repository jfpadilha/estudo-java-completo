package classe.desafio110;

public class Jantar {

//	Atributos

	public static void main(String[] args) {

		Comida c1 = new Comida("Feijão", 0.700);
		Comida c2 = new Comida("Arroz", 0.623);

		Pessoa p1 = new Pessoa("Joao", 87.054);
		System.out.println(p1.apresentar());
		p1.comer(c1);
		System.out.println(p1.apresentar());
		p1.comer(c1);
		System.out.println(p1.apresentar());
		p1.comer(c1);
		System.out.println(p1.apresentar());

		Pessoa p2 = new Pessoa("Andreia", 69.123);
		System.out.println(p2.apresentar());
		p2.comer(c2);
		p2.comer(c2);
		System.out.println(p2.apresentar());
		p2.comer(c2);
		p2.comer(c2);

	}

}
