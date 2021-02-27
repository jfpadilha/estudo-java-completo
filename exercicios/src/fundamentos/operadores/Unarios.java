package fundamentos.operadores;

public class Unarios {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;

		a++; // igual a = a + 1;
		a--; // igual a = a - 1;

		++b; // b = b + 1;
		--b; // b = b - 1;

		System.out.println(a);
		System.out.println(b);

		System.out.println(++a == b--); // o sinal que vem antes, eh executado antes(incremente A - compara e decrementa
										// o B

		System.out.println(a);
		System.out.println(b);
	}

}
