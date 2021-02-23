package fundamentos;

public class ConversaoNumerosString {
	public static void main(String[] args) {
		
		Integer num1 = 100101101;
		
		String s1 = num1.toString();	//
		String s2 = Integer.toString(num1);
		
		int carac = (int) num1.toString().length();
		
		System.out.printf("%s | %s | Numero: %d  | Qtd: %d", s1, s2, num1, carac);		
	}

}
