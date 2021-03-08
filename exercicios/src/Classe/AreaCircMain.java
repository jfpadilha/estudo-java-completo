package Classe;

public class AreaCircMain {

	public static void main(String[] args) {

		AreaCirc a1 = new AreaCirc(10); // AreaCirc("raio")

		AreaCirc a2 = new AreaCirc(5);
		a2.raio = 20; // criando uma nova instancia setando um valor para o raio

		// retorna calculo da area
		System.out.printf("A1: %f\n", a1.area());
		System.out.printf("A2: %f \n\n", a2.area());

		// chamando o valor do PI fixado na variavel static
		System.out.printf("AreaCirc.PI: %f\n", AreaCirc.PI);

		// chamando metodo static (que faz o calculo) e passando o valor da area
		System.out.printf("AreaCirc.area(raio): %f\n\n", AreaCirc.area(90));

		System.out.printf("Math.PI: %f", Math.PI); // PI do Java

	}
}
