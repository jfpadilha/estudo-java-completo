package fundamentos;

public class ConversaoTiposPrimitivos_numericos {

	public static void main(String[] args) {

		double a = 1.987654654654; // houve uma conversao implicita
		System.out.println(a);

		float b = 1.0F; // precisa converter implicita colocando a letra 'F' ou
		float b2 = (float) 1.2112345; // convertendo de forma explicita (CAST)
		System.out.println(b2);
		
//quando fizer uma conversao explicita, pode haver perda de informacao
				
		int c = 125;
		byte d = (byte) c;	//converter de modo explicito

		//lembrando que byte vai de -127 a 126
		
		System.out.println(d); 
		
		double e = 1.4587456;
		int f = (int) e;
//		Nesse caso vai arredondar o double pra baixo, sempre para baixo		
		System.out.println(f);
	}
}
