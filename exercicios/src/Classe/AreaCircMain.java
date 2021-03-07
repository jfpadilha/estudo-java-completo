package Classe;

public class AreaCircMain {

	public static void main(String[] args) {

		AreaCirc a1 = new AreaCirc(10); // AreaCirc("raio")

		AreaCirc a2 = new AreaCirc(5);
		a2.raio = 90; // criando uma nova instancia e passando o valor para o raio

		System.out.println("A1: " + a1.area());
		System.out.println("A2: \n\n" + a2.area());

		System.out.println("AreaCirc.PI: " + AreaCirc.PI); // chamando o valor do PI definido na mão
		System.out.println("AreaCirc.area(raio): \n\n" + AreaCirc.area(90)); // chamando metodo static e passando o
																				// argumento
  
		System.out.println("Math.PI: " + Math.PI); // PI do Java

	}

}
