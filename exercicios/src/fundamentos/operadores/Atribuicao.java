package fundamentos.operadores;

public class Atribuicao {
	public static void main(String[] args) {
		int a = 3;
		int b = a;
		int c = a + b;
		
		c += b; //igual a: c = c + b;
		c -= a;	//igual c = c - a;
		c *= b;	//igual c = c * b;
		c /= b;	//igual c = c / a;
		c %= 2; //igual c = c % 2; (vai dar 0 (par) ou 1 (impar))
		
		c++;	// c = c + 1
		
		System.out.println(c);
		
		c %= 2; //c = c%2; (0 ou 1)
		
		
	}

}
