package fundamentos.operadores;

public class Logicos {
	public static void main(String[] args) {
		boolean cond1 = false;
		boolean cond2 = 9 > 7;

		System.out.println(cond1 && cond2);
		System.out.println(cond1 || cond2);
		System.out.println(cond1 ^ cond2); // OR exclusivo
		System.out.println(cond1 && cond2);
		System.out.println(cond1 && cond2);

		System.out.println("Tabela verdade E (AND)");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);

		System.out.println("Tabela verdade OU (OR)");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);

		System.out.println("Tabela verdade OU EXCLUSIVO (XOR)");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);

		System.out.println("Tabela verdade NEGADO (NOT)");
		System.out.println(!true);
		System.out.println(!false);
	}
}