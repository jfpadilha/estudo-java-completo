package fundamentos.operadores;

public class Logicos {
	public static void main(String[] args) {
		boolean cond1 = true;
		boolean cond2 = 3 > 7;

		System.out.println(cond1 && cond2);
		System.out.println(cond1 || cond2);
		System.out.println(cond1 ^ cond2); // OR exclusivo
		System.out.println(cond1 && cond2);
		System.out.println(cond1 && cond2);

	}
}