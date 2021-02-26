package fundamentos.operadores;

public class DesafioAritmetico {
	public static void main(String[] args) {

		int a = 3 * 4 - 10;
		int cubo = (int) Math.pow(a, 3); // "pow" de potencia "a elevado a 3"
		double cubod = Math.pow(a, 3); // "pow" de potencia "a elevado a 3"

		System.out.println(cubo);
		System.out.println(cubod);

		System.out.println("--------------------");

		int a1 = (int) Math.pow((6 * (3 + 2)), 2) / (3 * 2);

		int b1 = (int) (Math.pow((1 - 5) * (2 - 7) / 2, 2));

		int c1 = (int) (Math.pow((a1 - b1), 3)) / (int) Math.pow(10, 3);

		System.out.println(c1);

	}

}