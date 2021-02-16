package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		String s = "hello world";
		String x = " ->asd";
			
		s = s.replace("world", "mundo");
		s = s.toUpperCase(); //precisa setar o efeito para a variavel
		s = s.concat(x);
		
		System.out.println(s);
		System.out.println("world".toUpperCase());
		
		String y = "Olá mundo"
				.replace("mundo", "planeta")
				.concat(x);
		
		System.out.println(y);
		
//		Tipos primiritos nao usam notacao ponto
	}

}
