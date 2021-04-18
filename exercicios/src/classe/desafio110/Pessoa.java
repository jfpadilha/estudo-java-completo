package classe.desafio110;

public class Pessoa {

//	Atributos
	String nome;
	double peso;

//	Construtores
	Pessoa() {
	}

	Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}

//	Setters and getters

	void setpeso(double peso) {
		this.peso = peso;
	}

	void setnome(String nome) {
		this.nome = nome;
	}

// Metodos	

	void comer(Comida comida) {
		if (comida != null) {
			this.peso += comida.peso;
		}
	}

	String apresentar() {
		String a = "Nome: %s Peso: %f";
 		return String.format(a, this.nome, this.peso);
	}
}
