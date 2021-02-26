package fundamentos.operadores;

public class Relacionais {
	public static void main(String[] args) {

		int a = 97;
		int d = 'a'; // conforme a tabela cada letra contem um valor

		System.out.println(a == d);
		
		System.out.println( 3 > 4);
		System.out.println( 3 >= 3);
		System.out.println( 3 < 7);
		System.out.println( 30 >= 4);
		System.out.println( 30 != 4);
		
		double nota = 8;
		boolean bomComp = true;
		boolean passouPorMed = nota > 7;
		boolean temDesconto = bomComp && passouPorMed;
		
		System.out.println("Tem desc: " + temDesconto);
	}
}

